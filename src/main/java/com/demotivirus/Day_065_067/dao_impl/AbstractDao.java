package com.demotivirus.Day_065_067.dao_impl;

import com.demotivirus.Day_065_067.dao_abstract.GenericDao;
import com.demotivirus.Day_065_067.model.AbstractLanguage;

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

    @Override
    public T findFirstByWord(String word){
        return entityManager
                .createQuery("FROM " + clazz.getName() + " WHERE word = :word", clazz)
                .setParameter("word", word)
                .getSingleResult();
    }

    public boolean checkUniqueByWord(String word){
        Long values = entityManager
                .createQuery("SELECT COUNT(word) FROM " + clazz.getName() + " WHERE word = :word", Long.class)
                .setParameter("word", word)
                .getSingleResult();
        return values < 1;
    }

    @Override
    public void save(T t){
        entityManager.merge(t);
    }

    public void saveTranslation(AbstractLanguage language){

    }
}
