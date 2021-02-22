package com.demotivirus.Day_063.controller;

import com.demotivirus.Day_063.service.TranslationDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("eng")
public class EngController {
    @Autowired
    private TranslationDispatcher dispatcher;

    @GetMapping(path = {"", "list"})
    public String listWords(Model model){
        model.addAttribute("words", dispatcher.findAll("english"));
        return "eng-list";
    }
}
