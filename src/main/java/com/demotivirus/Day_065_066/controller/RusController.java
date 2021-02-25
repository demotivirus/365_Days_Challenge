package com.demotivirus.Day_065_066.controller;

import com.demotivirus.Day_065_066.model.Russian;
import com.demotivirus.Day_065_066.service.TranslationDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("rus/")
public class RusController {
    @Autowired
    private TranslationDispatcher dispatcher;

    @GetMapping(path = {"", "list"})
    public String listWords(Model model){
        model.addAttribute("words", dispatcher.findAll("russian"));
        return "rus-list";
    }

///////////////////////////

    @GetMapping("add-word")
    public String showFormAdd(Model model){
        model.addAttribute("word", new Russian());
        return "add-word";
    }

    @PostMapping("save-word")
    public String saveWord(@ModelAttribute("rus") Russian russian){
        dispatcher.save("russian", russian);
        return "redirect:/rus/list";
    }

///////////////////////////////

    @GetMapping("add-translation")
    public ModelAndView showFormTranslation(ModelAndView model) {
        model.addObject("form", new Russian());
        model.setViewName("add-word-translation");
        return model;
    }

    @PostMapping("save-translation")
    public String saveEngTranslation(@ModelAttribute("rus") Russian russian){
        dispatcher.saveTranslation(russian, "english");
        return "redirect:/rus/list";
    }

////////////////////////////
}
