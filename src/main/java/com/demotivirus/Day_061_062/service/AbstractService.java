package com.demotivirus.Day_061_062.service;

import com.demotivirus.Day_061_062.dao_abstract.LanguageDao;
import com.demotivirus.Day_061_062.model.AbstractLanguage;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractService implements GlobalService {
    private LanguageDao languageDao;

    @Autowired
    public AbstractService(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    public AbstractService() {

    }

    @Override
    public AbstractLanguage findFirstWord(String word) {
        return languageDao.findFirstByWord(word);
    }
}
