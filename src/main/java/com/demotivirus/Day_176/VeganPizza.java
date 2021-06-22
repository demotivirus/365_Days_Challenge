package com.demotivirus.Day_176;

import lombok.ToString;

@ToString
public class VeganPizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Pizza without meat");
    }
}
