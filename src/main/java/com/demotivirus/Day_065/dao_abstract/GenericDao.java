package com.demotivirus.Day_065.dao_abstract;

import java.util.List;

public interface GenericDao<T, ID> {
    List<T> findAll();
    void save(T t);
    boolean checkUniqueByWord(String word);
}
