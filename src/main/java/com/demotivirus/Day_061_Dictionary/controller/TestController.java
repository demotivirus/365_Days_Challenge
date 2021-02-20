package com.demotivirus.Day_061_Dictionary.controller;

import com.demotivirus.Day_061_Dictionary.service.RussianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test/")
public class TestController {
    @Autowired
    private RussianService russianService;

    @GetMapping("list")
    public String findAllWords(Model model){
        model.addAttribute("words", russianService.findAll());
        return "test-page";
    }
}
