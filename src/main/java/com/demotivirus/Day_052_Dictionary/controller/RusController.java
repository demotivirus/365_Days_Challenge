package com.demotivirus.Day_052_Dictionary.controller;

import com.demotivirus.Day_052_Dictionary.model.Eng;
import com.demotivirus.Day_052_Dictionary.model.Rus;
import com.demotivirus.Day_052_Dictionary.service.RusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("rus")
public class RusController {
    @Autowired
    private RusService rusService;

    @GetMapping(value = {"", "list"})
    public String listWords(Model model){
        model.addAttribute("rusWords", rusService.getAllWords());
        return "rus-list";
    }

    @GetMapping("add-word")
    public String showFormAdd(Model model){
        model.addAttribute("word", new Rus());
        return "add-word";
    }

    @GetMapping("add-eng-translation")
    public ModelAndView showFormTranslation(ModelAndView model) {
        model.addObject("form", new Rus());
        model.setViewName("add-word-translation");
        return model;
    }

    @PostMapping("save-word")
    public String saveWord(@ModelAttribute("rus") Rus rus){
        rusService.saveWord(rus);
        return "redirect:/rus/list";
    }

    @PostMapping("save-translation")
    public String saveEngTranslation(@ModelAttribute("rus") Rus rus){
        rusService.saveEngTranslation(rus, new Eng(rus.getTranslationWord()));
        return "redirect:/rus/list";
    }
}
