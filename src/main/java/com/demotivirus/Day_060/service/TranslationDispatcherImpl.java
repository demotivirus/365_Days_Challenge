package com.demotivirus.Day_060.service;

import com.demotivirus.Day_060.dao.EngDao;
import com.demotivirus.Day_060.dao.RusDao;
import com.demotivirus.Day_060.model.Eng;
import com.demotivirus.Day_060.model.Rus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TranslationDispatcherImpl implements TranslationDispatcher {
    private RusDao rusDao;
    private EngDao engDao;

    @Autowired
    public TranslationDispatcherImpl(RusDao rusDao, EngDao engDao) {
        this.rusDao = rusDao;
        this.engDao = engDao;
    }

    @Override
    public List<String> findAllEngToRusTranslations(Long engId) {
        List<String> allEngToRusTranslations = engDao.findAllRusWordsByEngId(engId);
        return allEngToRusTranslations;
    }

    @Override
    public List<String> findAllRusToEngTranslations(Long rusId) {
        List<String> allRusToEngTranslations = rusDao.findAllEngWordsByRusId(rusId);
        return allRusToEngTranslations;
    }

    @Override
    public Eng findFirstEngByWord(String word){
        return engDao.findFirstByWord(word);
    }

    @Override
    public Rus findFistRusByWord(String word) {
        return rusDao.findFirstByWord(word);
    }
}
