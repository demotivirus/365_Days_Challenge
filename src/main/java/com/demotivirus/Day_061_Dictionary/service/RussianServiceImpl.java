package com.demotivirus.Day_061_Dictionary.service;

import com.demotivirus.Day_061_Dictionary.dao_abstract.RussianDao;
import com.demotivirus.Day_061_Dictionary.model.Russian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RussianServiceImpl implements RussianService{
    private RussianDao russianDao;

    @Autowired
    public RussianServiceImpl(RussianDao russianDao) {
        this.russianDao = russianDao;
    }

    @Override
    public List<Russian> findAll() {
        return russianDao.findAll();
    }
}
