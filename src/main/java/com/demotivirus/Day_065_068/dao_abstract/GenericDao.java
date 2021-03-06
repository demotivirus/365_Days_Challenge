package com.demotivirus.Day_065_068.dao_abstract;

import com.demotivirus.Day_065_068.model.AbstractLanguage;

import java.util.List;

public interface GenericDao<T, ID> {
    List<T> findAll();
    void save(T t);
    boolean checkUniqueByWord(String word);
    T findFirstByWord(String word);
    T findById(ID id);
    void saveTranslation(AbstractLanguage language);
    List<String> findAllWordsById_ForManyToMany(String leadLangName, Long id, String translationClassName);
}
