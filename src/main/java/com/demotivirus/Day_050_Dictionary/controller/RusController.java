package com.demotivirus.Day_050_Dictionary.controller;

import com.demotivirus.Day_050_Dictionary.model.Rus;
import com.demotivirus.Day_050_Dictionary.service.RusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("rus")
public class RusController {
    @Autowired
    private RusService rusService;

    @GetMapping("list")
    public String listWords(Model model){
        model.addAttribute("rusWords", rusService.getAllWords());
        return "rus-list";
    }

    @GetMapping("add-word")
    public String showFormAdd(Model model){
        model.addAttribute("word", new Rus());
        return "add-word";
    }

    @PostMapping("save-word")
    public String saveWord(@ModelAttribute("rus") Rus rus){
        rusService.saveWord(rus);
        return "redirect:/rus/list";
    }
}
