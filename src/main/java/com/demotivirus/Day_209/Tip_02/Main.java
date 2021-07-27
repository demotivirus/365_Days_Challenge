package com.demotivirus.Day_209.Tip_02;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new VeganBurger());
        System.out.println(meal);
    }
}
