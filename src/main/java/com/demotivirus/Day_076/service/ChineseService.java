package com.demotivirus.Day_076.service;

import com.demotivirus.Day_076.dao.ChineseDao;
import com.demotivirus.Day_076.entity.Chinese;

public class ChineseService extends AbstractService<Chinese, ChineseDao> {
    public ChineseService(ChineseDao chineseDao) {
        super(chineseDao);
    }
}
