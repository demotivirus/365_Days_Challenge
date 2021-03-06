package com.demotivirus.Day_075.controller;

import com.demotivirus.Day_075.model.English;
import com.demotivirus.Day_075.service.TranslationDispatcher;
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
@RequestMapping("eng")
public class EngController {
    @Autowired
    private TranslationDispatcher dispatcher;

    @GetMapping(path = {"", "list"})
    public String listWords(Model model){
        model.addAttribute("words", dispatcher.findAll("english"));
        return "eng-list";
    }

///////////////////////////////

    @GetMapping("add-word")
    public String showFormAdd(Model model){
        model.addAttribute("word", new English());
        return "add-word";
    }

    @PostMapping("save-word")
    public String saveWord(@ModelAttribute("eng") English english){
        dispatcher.save("english", english);
        return "redirect:/eng/list";
    }

////////////////////////////

    @GetMapping("add-translation")
    public ModelAndView showFormTranslation(ModelAndView model) {
        model.addObject("form", new English());
        model.setViewName("add-word-translation");
        return model;
    }

    @PostMapping("save-translation")
    public String saveEngTranslation(@ModelAttribute("eng") English english){
        dispatcher.saveTranslation(english, "russian");
        return "redirect:/eng/list";
    }

////////////////////////////

    @GetMapping("add-translation/{id}")
    public ModelAndView showFormTranslation(@PathVariable("id") Long id, ModelAndView model) {
        model.addObject("form", new English(id));
        model.setViewName("add-word-translation-by-id");
        return model;
    }

    @PostMapping("save-translation/{id}")
    public String saveEngTranslationIndividual(@PathVariable("id") long id, @ModelAttribute("eng") English english){
        English parseEng = (English) dispatcher.findById("english", id);
        parseEng.setTranslationWord(english.getTranslationWord());
        dispatcher.saveTranslation(parseEng, "russian");
        return "redirect:/eng/list";
    }
}
