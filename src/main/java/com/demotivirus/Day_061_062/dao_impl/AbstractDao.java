package com.demotivirus.Day_061_062.dao_impl;

import com.demotivirus.Day_061_062.dao_abstract.GenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class AbstractDao<T, ID> implements GenericDao<T, ID> {
    private final Class<T> clazz;

    @PersistenceContext
    EntityManager entityManager;

    protected AbstractDao() {
        clazz = (Class<T>) ((java.lang.reflect.ParameterizedType)
                this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public List<T> findAll() {
        return entityManager.createQuery("FROM " + clazz.getName()).getResultList();
    }
}
