package com.demotivirus.Day_076.controller;

import com.demotivirus.Day_076.entity.English;
import com.demotivirus.Day_076.service.EnglishService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eng")
public class EnglishController extends AbstractController<English, EnglishService> {
    protected EnglishController(EnglishService englishService) {
        super(englishService);
    }
}
