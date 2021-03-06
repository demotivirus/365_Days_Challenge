package com.demotivirus.Day_075.service;

import com.demotivirus.Day_075.dao_abstract.ChineseDao;
import com.demotivirus.Day_075.dao_abstract.EnglishDao;
import com.demotivirus.Day_075.dao_abstract.RussianDao;
import com.demotivirus.Day_075.model.AbstractLanguage;
import com.demotivirus.Day_075.model.Chinese;
import com.demotivirus.Day_075.model.English;
import com.demotivirus.Day_075.model.Russian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TranslationDispatcherImpl implements TranslationDispatcher {
    private RussianDao russianDao;
    private EnglishDao englishDao;
    private ChineseDao chineseDao;

    @Autowired
    public TranslationDispatcherImpl(RussianDao russianDao, EnglishDao englishDao, ChineseDao chineseDao) {
        this.russianDao = russianDao;
        this.englishDao = englishDao;
        this.chineseDao = chineseDao;
    }

    public List<? extends AbstractLanguage> findAll(String langName) {
        return switch (langName.toLowerCase()) {
            case "russian" -> russianDao.findAll();
            case "english" -> englishDao.findAll();
            default -> null;
        };
    }

    @Override
    public void save(String langName, AbstractLanguage abstractLanguage) {
        abstractLanguage.setWord(abstractLanguage.getWord().toLowerCase());
        if (checkUniqueByWord(langName, abstractLanguage.getWord())) {
            switch (langName.toLowerCase()) {
                case "russian":
                    Russian russian = (Russian) abstractLanguage;
                    russianDao.save(russian);
                    break;
                case "english":
                    English english = (English) abstractLanguage;
                    englishDao.save(english);
                    break;
            }
        }
    }

    @Override
    public boolean checkUniqueByWord(String langName, String word) {
        switch (langName.toLowerCase()) {
            case "russian":
                return russianDao.checkUniqueByWord(word);
            case "english":
                return englishDao.checkUniqueByWord(word);
            default:
                return false;
        }
    }

    @Override
    public void saveTranslation(AbstractLanguage leadClass, String translationLangName) {
        if (leadClass.getWord() != null) {
            leadClass.setWord(leadClass.getWord().toLowerCase());
        }
        if (leadClass.getTranslationWord() != null) {
            leadClass.setTranslationWord(leadClass.getTranslationWord().toLowerCase());
        }

        if (leadClass.getClass() == null) {
            saveTranslationIfWordIsUniq(leadClass, translationLangName);
        } else {
            saveTranslationIfWordIsNonUniq(leadClass, translationLangName);
        }
    }

    private void saveTranslationIfWordIsUniq(AbstractLanguage leadClass, String translationLangName) {
        if (leadClass.getClass() == Russian.class) {
            Russian russian = new Russian();
            russian.setWord(leadClass.getWord());
            switch (translationLangName) {
                case "english":
                    russian.addEnglishWord(leadClass.getTranslationWord());
                    break;
                case "chinese":
                    russian.addChineseWord(leadClass.getTranslationWord());
                    break;
            }

            russianDao.save(russian);
        }

        if (leadClass.getClass() == English.class) {
            English english = new English();
            english.setWord(leadClass.getWord());
            switch (translationLangName) {
                case "russian":
                    english.addRussianWord(leadClass.getTranslationWord());
                    break;
                case "chinese":
                    english.addChineseWord(leadClass.getTranslationWord());
                    break;
            }

            englishDao.save(english);
        }

        if (leadClass.getClass() == Chinese.class) {
            Chinese chinese = new Chinese();
            chinese.setWord(leadClass.getWord());
            switch (translationLangName) {
                case "russian":
                    chinese.addRussianWord(leadClass.getTranslationWord());
                    break;
                case "english":
                    chinese.addEnglishWord(leadClass.getTranslationWord());
                    break;
            }

            chineseDao.save(chinese);
        }
    }

    @Transactional
    void saveTranslationIfWordIsNonUniq(AbstractLanguage leadClass, String translationLangName) {
        if (leadClass.getClass() == Russian.class) {
            Russian russian = russianDao.findFirstByWord(leadClass.getWord());
            switch (translationLangName) {
                case "english":
                    List<String> englishWords =
                            russianDao.findAllWordsById_ForManyToManyLeft("russian", russian.getId(), translationLangName);
                    if (!englishWords.contains(leadClass.getTranslationWord())) { //save only uniq words
                        English english = englishDao.findFirstByWord(leadClass.getTranslationWord());
                        if (english != null) {
                            List<String> russianWords =
                                    englishDao.findAllWordsById_ForManyToManyLeft("russian", english.getId(), translationLangName);
                            if (!russianWords.contains(russian.getWord())) { //save only uniq words
                                english.addRussianWord(russian); //save eng-rus
                                russian.addEnglishWord(english); //save rus-eng
                                russianDao.save(russian); //SAVE ALL
                            }
                        } //if ENG word not exist
                        else {
                            russian.addEnglishWord(leadClass.getTranslationWord());
                            russianDao.save(russian);
                        }
                    }
                    break;
                case "chinese":
                    // TO DO
                    break;
            }

            //russianDao.save(russian);
        }

        //BUG HERE
        if (leadClass.getClass() == English.class) {
            English english = englishDao.findFirstByWord(leadClass.getWord());
            switch (translationLangName) {
                case "russian":
                    List<String> russianWords =
                            englishDao.findAllWordsById_ForManyToManyRight("russian", english.getId(), "english");
                    if (!russianWords.contains(english.getTranslationWord())) { //save only uniq words
                        Russian russian = russianDao.findFirstByWord(leadClass.getTranslationWord());
                        if (russian != null) {
                            List<String> englishWords =
                                    russianDao.findAllWordsById_ForManyToManyRight("russian", russian.getId(), "english");
                            if (!englishWords.contains(russian.getWord())) { //save only uniq words
                                russian.addEnglishWord(english); //save rus-eng
                                english.addRussianWord(russian); //save eng-rus
                                englishDao.save(english); //SAVE ALL
                            }
                        } //if RUS word not exist
                        else {
                            //FIX BUG FOR SAVE - save from over class because in this class not work reflection
                            Russian parserRus = new Russian(leadClass.getTranslationWord());
                            parserRus.addEnglishWord(english);
                            russianDao.save(parserRus);
                        }
                    }
                    break;
                case "chinese":
                    // TO DO
                    break;
            }

            //englishDao.save(english);
        }
    }

    @Override
    public AbstractLanguage findFirstByWord(String langName, String word) {
        switch (langName.toLowerCase()) {
            case "russian":
                return russianDao.findFirstByWord(word);
            case "english":
                return englishDao.findFirstByWord(word);
            case "chinese":
                return chineseDao.findFirstByWord(word);
            default:
                return null;
        }
    }

    @Override
    public AbstractLanguage findById(String langName, Long id) {
        switch (langName.toLowerCase()) {
            case "russian":
                Russian russian = russianDao.findById(id);
                return russian;
            case "english":
                return englishDao.findById(id);
            case "chinese":
                return chineseDao.findById(id);
            default:
                return null;
        }
    }
}
