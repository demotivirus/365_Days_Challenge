package com.demotivirus.Day_061_062.dao_abstract;

import java.util.List;

public interface GenericDao<T, ID> {
    List<T> findAll();
}
