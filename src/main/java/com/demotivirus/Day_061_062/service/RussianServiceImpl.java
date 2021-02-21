package com.demotivirus.Day_061_062.service;

import com.demotivirus.Day_061_062.dao_abstract.RussianDao;
import com.demotivirus.Day_061_062.model.Russian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RussianServiceImpl extends AbstractService implements RussianService{
    private RussianDao russianDao;

    @Autowired
    public RussianServiceImpl(RussianDao russianDao) {
        super();
        this.russianDao = russianDao;
    }

    @Override
    public List<Russian> findAll() {
        return russianDao.findAll();
    }
}
