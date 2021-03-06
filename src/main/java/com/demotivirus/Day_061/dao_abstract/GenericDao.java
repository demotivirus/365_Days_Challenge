package com.demotivirus.Day_061.dao_abstract;

import java.util.List;

public interface GenericDao<T, ID> {
    List<T> findAll();
    T findFirstByWord(String word);
}
