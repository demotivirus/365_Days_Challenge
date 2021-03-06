package com.demotivirus.Day_063.service;

import com.demotivirus.Day_063.dao_abstract.EnglishDao;
import com.demotivirus.Day_063.dao_abstract.RussianDao;
import com.demotivirus.Day_063.model.AbstractLanguage;
import com.demotivirus.Day_063.model.English;
import com.demotivirus.Day_063.model.Russian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TranslationDispatcherImpl implements TranslationDispatcher {
    private RussianDao russianDao;
    private EnglishDao englishDao;

    @Autowired
    public TranslationDispatcherImpl(RussianDao russianDao, EnglishDao englishDao) {
        this.russianDao = russianDao;
        this.englishDao = englishDao;
    }

    public List<? extends AbstractLanguage> findAll(String langName) {
        switch (langName.toLowerCase()){
            case "russian": return russianDao.findAll();
            case "english": return englishDao.findAll();
            default: return null;
        }
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
        switch (langName.toLowerCase()){
            case "russian": return russianDao.checkUniqueByWord(word);
            case "english": return englishDao.checkUniqueByWord(word);
            default: return false;
        }
    }
}
