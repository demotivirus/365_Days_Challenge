package com.demotivirus.Day_053_054.controller;

import com.demotivirus.Day_053_054.model.Eng;
import com.demotivirus.Day_053_054.service.EngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("eng")
public class EngController {
    @Autowired
    private EngService engService;

    @GetMapping("list")
    public String listWords(Model model){
        model.addAttribute("words", engService.getAllWords());
        return "eng-list";
    }

    @GetMapping("add-word")
    public String showFormAdd(Model model){
        model.addAttribute("word", new Eng());
        return "add-word";
    }

    @PostMapping("save-word")
    public String saveWord(@ModelAttribute("eng") Eng eng){
        engService.saveWord(eng);
        return "redirect:/eng/list";
    }
}
