package com.demotivirus.Day_053_Dictionary.controller;

import com.demotivirus.Day_053_Dictionary.model.Rus;
import com.demotivirus.Day_053_Dictionary.service.RusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        model.addAttribute("words", rusService.getAllWords());
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
        rusService.saveEngTranslation(rus);
        return "redirect:/rus/list";
    }

    @GetMapping("update/{id}")
    public String updateRusWordShowForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("words", rusService.getRusById(id));
        return "update-word";
    }

    @PostMapping("update-word")
    public String updateRusWord(@ModelAttribute Rus rus) {
        rusService.saveWord(rus);
        return "redirect:/rus";
    }
}
