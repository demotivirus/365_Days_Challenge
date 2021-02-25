package com.demotivirus.Day_065_066.service;

import com.demotivirus.Day_065_066.model.AbstractLanguage;

import java.util.List;

public interface TranslationDispatcher {
    List<? extends AbstractLanguage> findAll(String langName);
    void save(String langName, AbstractLanguage abstractLanguage);
    boolean checkUniqueByWord(String langName, String word);
    void saveTranslation(String leadLangName, AbstractLanguage leadClass, String translationForLeadLangName);
    AbstractLanguage findFirstByWord(String langName,String word);
}
