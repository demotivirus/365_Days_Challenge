package com.demotivirus.Day_053_054.controller;

import com.demotivirus.Day_053_054.model.Rus;
import com.demotivirus.Day_053_054.service.EngService;
import com.demotivirus.Day_053_054.service.RusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("rus-eng")
public class RusEngController {
    private RusService rusService;
    private EngService engService;

    @Autowired
    public RusEngController(RusService rusService, EngService engService) {
        this.rusService = rusService;
        this.engService = engService;
    }

    @GetMapping(value = {"", "list"})
    public ModelAndView listTranslations(ModelAndView modelAndView){
        modelAndView.addObject("rus", new Rus());
        modelAndView.addObject("rusWords", rusService.getAllWords());
        modelAndView.addObject("engWords", engService.getAllWords());
        modelAndView.setViewName("rus-eng-list");
        return modelAndView;
    }
}
