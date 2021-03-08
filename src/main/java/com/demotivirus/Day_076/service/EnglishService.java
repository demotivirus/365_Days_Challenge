package com.demotivirus.Day_076.service;

import com.demotivirus.Day_076.dao.EnglishDao;
import com.demotivirus.Day_076.entity.English;

public class EnglishService extends AbstractService<English, EnglishDao> {
    public EnglishService(EnglishDao englishDao) {
        super(englishDao);
    }
}
