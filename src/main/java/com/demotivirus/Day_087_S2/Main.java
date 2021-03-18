package com.demotivirus.Day_087_S2;

import com.demotivirus.Day_087_S2.product.Meal;
import com.demotivirus.Day_087_S2.product.MealBuilder;
import com.demotivirus.Day_087_S2.product.Product;
import com.demotivirus.Day_087_S2.product.ProductDispatcher;

public class Main {
    public static void main(String[] args) {
        Product cheeseBurger = ProductDispatcher.getProduct("Cheese burger");
        System.out.println(cheeseBurger);
        Product cocacola = ProductDispatcher.getProduct("Cocacola");

        Meal meal = new Meal();
        meal.addProduct(cheeseBurger);
        meal.addProduct(cocacola);
        meal.print();

        Meal mealForBuilder = MealBuilder.prepareVegMeal();
        mealForBuilder.print();
    }
}
