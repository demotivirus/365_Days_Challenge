package com.demotivirus.Day_053_055.controller;

import com.demotivirus.Day_053_055.model.Rus;
import com.demotivirus.Day_053_055.service.RusService;
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
@RequestMapping("rus/")
public class RusController {
    @Autowired
    private RusService rusService;

    @GetMapping(value = {"", "list"})
    public String listWords(Model model){
        model.addAttribute("words", rusService.getAllWords());
        return "rus-list";
    }

///////////////////////////

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

////////////////////////////

    @GetMapping("add-eng-translation")
    public ModelAndView showFormTranslation(ModelAndView model) {
        model.addObject("form", new Rus());
        model.setViewName("add-word-translation");
        return model;
    }

    @PostMapping("save-translation")
    public String saveEngTranslation(@ModelAttribute("rus") Rus rus){
        rusService.saveEngTranslation(rus);
        return "redirect:/rus/list";
    }

////////////////////////////

    @GetMapping("add-eng-translation/{id}")
    public ModelAndView showFormTranslation(@PathVariable("id") Long id, ModelAndView model) {
        Rus rus = rusService.getRusById(id);
        model.addObject("form", rus);
        model.setViewName("add-individual-translation");
        return model;
    }

    @PostMapping("add-eng-translation/{id}")
    public String saveEngTranslationIndividual(@PathVariable("id") long id, @ModelAttribute("rus") Rus rus){
        rusService.saveEngTranslation(rus);
        return "redirect:/rus/list";
    }

////////////////////////////

    @GetMapping("update/{id}")
    public String updateRusWordShowForm(@PathVariable("id") long id, Model model) {
        model.addAttribute("words", rusService.getRusById(id));
        return "update-word";
    }

    @PostMapping("update/{id}")
    public String updateRusWord(@PathVariable("id") long id, @ModelAttribute Rus rus) {
        rusService.updateWord(rus);
        return "redirect:/rus/list";
    }
}
