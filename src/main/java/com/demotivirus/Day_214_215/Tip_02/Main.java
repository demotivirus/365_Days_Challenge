package com.demotivirus.Day_214_215.Tip_02;

import com.demotivirus.Day_209_211.Tip_02.ChickenBurger;
import com.demotivirus.Day_209_211.Tip_02.Meal;
import com.demotivirus.Day_209_211.Tip_02.VeganBurger;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new VeganBurger());
        System.out.println(meal);
    }
}
