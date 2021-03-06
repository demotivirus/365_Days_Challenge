package com.demotivirus.Day_075.service;

import com.demotivirus.Day_075.model.AbstractLanguage;

import java.util.List;

public interface TranslationDispatcher {
    List<? extends AbstractLanguage> findAll(String langName);
    void save(String langName, AbstractLanguage abstractLanguage);
    boolean checkUniqueByWord(String langName, String word);
    void saveTranslation(AbstractLanguage leadClass, String translationLangName);
    AbstractLanguage findFirstByWord(String langName,String word);
    AbstractLanguage findById(String langName, Long id);
}
