package com.demotivirus.Day_065.dao_abstract;

import com.demotivirus.Day_065.model.AbstractLanguage;

import java.util.List;

public interface GenericDao<T, ID> {
    List<T> findAll();
    void save(T t);
    boolean checkUniqueByWord(String word);
    T findFirstByWord(String word);
    void saveTranslation(AbstractLanguage language);
}
