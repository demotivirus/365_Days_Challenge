package com.demotivirus.Day_076.controller;

import com.demotivirus.Day_076.entity.Russian;
import com.demotivirus.Day_076.service.RussianService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rus")
public class RussianController extends AbstractController<Russian, RussianService> {
    protected RussianController(RussianService russianService) {
        super(russianService);
    }
}
