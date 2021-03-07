package com.demotivirus.Day_076.service;

import com.demotivirus.Day_076.entity.AbstractLanguage;

public interface GenericService<E extends AbstractLanguage> {
    void save(E e);
}
