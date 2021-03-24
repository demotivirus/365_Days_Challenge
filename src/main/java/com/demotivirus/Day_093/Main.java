package com.demotivirus.Day_093;

public class Main {
    public static void main(String[] args) {
        Food food = new ChineseDecorator(new VegFood());
        food.prepareFood();
    }
}
