package com.demotivirus.Day_206;

import com.demotivirus.Day_204.Dish;
import com.demotivirus.Day_204.TYPE;

import java.util.List;

public class StreamExample9 {
    public static void main(String[] args) {
        List<Dish> dishes = List.of(new Dish("Bananas", true, 200, TYPE.FRUIT),
                new Dish("Potato", true,300, TYPE.VEGETABLE),
                new Dish("Watermelon", true, 400, TYPE.FRUIT),
                new Dish("Nuts", true, 650, TYPE.OTHER),
                new Dish("Stake", false, 399, TYPE.MEAT));

        boolean isHealthy = dishes.stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);
        boolean isHealthyToo = dishes.stream().noneMatch(d -> d.getCalories() >= 1000);
        System.out.println(isHealthyToo);
    }
}
