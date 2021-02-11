package com.demotivirus.Day_052_Dictionary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
    @GetMapping
    public String index(){
        return "index";
    }
}
