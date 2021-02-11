package com.demotivirus.Day_052_Dictionary.controller;

import com.demotivirus.Day_052_Dictionary.model.Drink;
import com.demotivirus.Day_052_Dictionary.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("person")
public class PersonController {
    @GetMapping("/drinks")
    public String getDrinks(Model model) {
        Person person = new Person(30L);

        // ud normally get these from the database.
        List<Drink> selectableDrinks = Arrays.asList(
                new Drink(1L, "coke"),
                new Drink(2L, "fanta"),
                new Drink(3L, "sprite")
        );

        model.addAttribute("person", person);
        model.addAttribute("selectableDrinks", selectableDrinks);

        return "drinks";
    }

    @PostMapping("/drinks")
    public String postDrinks(@ModelAttribute("person") Person person) {
        // person.drinks will contain only the selected drinks
        System.err.println(person);
        return "drinks";
    }
}
