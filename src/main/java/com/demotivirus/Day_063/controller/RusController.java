package com.demotivirus.Day_063.controller;

import com.demotivirus.Day_063.model.Russian;
import com.demotivirus.Day_063.service.TranslationDispatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
