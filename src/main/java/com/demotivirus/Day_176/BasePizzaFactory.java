package com.demotivirus.Day_176;

public class BasePizzaFactory {
    public static Pizza create(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese": return new CheesePizza();
            case "vegan": return new VeganPizza();
            default: return new CheesePizza();
        }
    }
}
