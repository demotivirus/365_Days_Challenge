package com.demotivirus.Day_065_068.controller;

import com.demotivirus.Day_065_068.service.TranslationDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test/")
public class TestController {
    @Autowired
    private TranslationDispatcher dispatcher;

    @GetMapping("list")
    public String findAllWords(Model model){
        model.addAttribute("words", dispatcher.findAll("russian"));
        return "test-page";
    }
}
