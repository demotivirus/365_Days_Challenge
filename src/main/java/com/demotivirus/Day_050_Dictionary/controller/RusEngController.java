package com.demotivirus.Day_050_Dictionary.controller;

import com.demotivirus.Day_050_Dictionary.model.Eng;
import com.demotivirus.Day_050_Dictionary.model.Rus;
import com.demotivirus.Day_050_Dictionary.service.EngService;
import com.demotivirus.Day_050_Dictionary.service.RusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("rus-eng")
public class RusEngController {
    @Autowired
    private RusService rusService;
    @Autowired
    private EngService engService;

    @GetMapping("add-word")
    public ModelAndView showFormAdd(ModelAndView model) {
        model.addObject("form", new Rus());
        model.setViewName("add-word-translation");
        return model;
    }


    @PostMapping("save-word")
    public String saveWord(@ModelAttribute("rus") Rus rus){
        rusService.saveEngTranslation(rus, new Eng(rus.getTranslationWord()));
        return "redirect:/rus/list";
    }
}
