package com.demotivirus.Day_076.service;

import com.demotivirus.Day_076.dao.GenericDao;
import com.demotivirus.Day_076.entity.AbstractLanguage;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractService
        <E extends AbstractLanguage, R extends GenericDao<E>>
        implements GenericService<E> {

    protected final R r;

    @Autowired
    public AbstractService(R r) {
        this.r = r;
    }

    @Override
    public void save(E e){
        r.save(e);
    }
}
