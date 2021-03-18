package com.demotivirus.Day_087_S2.product;

public class MealBuilder {
    private MealBuilder(){

    }

    public static Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addProduct(ProductDispatcher.getProduct("Vegan burger"));
        meal.addProduct(ProductDispatcher.getProduct("CocaCola"));
        return meal;
    }

    public static Meal prepareMeal(){
        Meal meal = new Meal();
        meal.addProduct(ProductDispatcher.getProduct("Cheese burger"));
        meal.addProduct(ProductDispatcher.getProduct("CocaCola"));
        return meal;
    }
}
