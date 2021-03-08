package com.demotivirus.Day_076.controller;

import com.demotivirus.Day_076.entity.Chinese;
import com.demotivirus.Day_076.service.ChineseService;

public class ChineseController extends AbstractController<Chinese, ChineseService> {
    protected ChineseController(ChineseService chineseService) {
        super(chineseService);
    }
}
