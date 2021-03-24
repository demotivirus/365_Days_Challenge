package com.demotivirus.Day_093;

public class ChineseDecorator extends FoodDecorator{
    public ChineseDecorator(Food food) {
        super(food);
    }

    @Override
    public void prepareFood(){
        food.prepareFood();
        System.out.println("Chinese food");
    }
}
