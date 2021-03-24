package com.demotivirus.Day_093;

public class FoodDecorator implements Food{
    protected Food food;

    public FoodDecorator(Food food){
        this.food = food;
    }

    @Override
    public void prepareFood() {
        food.prepareFood();
    }
}
