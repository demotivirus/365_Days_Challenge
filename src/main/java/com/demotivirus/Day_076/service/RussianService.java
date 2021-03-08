package com.demotivirus.Day_076.service;

import com.demotivirus.Day_076.dao.RussianDao;
import com.demotivirus.Day_076.entity.Russian;

public class RussianService extends AbstractService<Russian, RussianDao> {
    public RussianService(RussianDao russianDao) {
        super(russianDao);
    }
}
