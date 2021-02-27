package com.demotivirus.Day_065_068.service;

import com.demotivirus.Day_065_068.dao_abstract.ChineseDao;
import com.demotivirus.Day_065_068.dao_abstract.EnglishDao;
import com.demotivirus.Day_065_068.dao_abstract.RussianDao;
import com.demotivirus.Day_065_068.model.AbstractLanguage;
import com.demotivirus.Day_065_068.model.Chinese;
import com.demotivirus.Day_065_068.model.English;
import com.demotivirus.Day_065_068.model.Russian;
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
        switch (langName.toLowerCase()) {
            case "russian":
                return russianDao.findAll();
            case "english":
                return englishDao.findAll();
            default:
                return null;
        }
    }

    @Override
    public void save(String langName, AbstractLanguage abstractLanguage) {
        abstractLanguage.setWord(abstractLanguage.getWord().toLowerCase());
        if (checkUniqueByWord(langName, abstractLanguage.getWord())) {
            switch (langName.toLowerCase()) {
                case "russian":
                    com.demotivirus.Day_065_068.model.Russian russian = (com.demotivirus.Day_065_068.model.Russian) abstractLanguage;
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

    private void saveTranslationIfWordIsNonUniq(AbstractLanguage leadClass, String translationLangName) {
        if (leadClass.getClass() == Russian.class) {
            Russian russian = russianDao.findFirstByWord(leadClass.getWord());
            switch (translationLangName) {
                case "english":
                    List<String> englishWords =
                            russianDao.findAllWordsById_ForManyToMany("russian", russian.getId(), translationLangName);
                    if (!englishWords.contains(russian.getTranslationWord())) { //save only uniq words
                        English english = englishDao.findFirstByWord(leadClass.getTranslationWord());
                        if (english != null) {
                            List<String> russianWords =
                                    englishDao.findAllWordsById_ForManyToMany("russian", english.getId(), translationLangName);
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

            russianDao.save(russian);
        }
    }

    @Override
    public AbstractLanguage findFirstByWord(String langName, String word) {
        switch (langName.toLowerCase()) {
            case "russian":
                return russianDao.findFirstByWord(word);
            case "english":
                return englishDao.findFirstByWord(word);
            default:
                return null;
        }
    }
}
