package com.demotivirus.Day_176;

import lombok.ToString;

@ToString
public class CheesePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Pizza with cheese");
    }
}
