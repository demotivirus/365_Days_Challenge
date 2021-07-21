package com.demotivirus.Day_204;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Dish> dishes = List.of(new Dish("Bananas", true, 200, TYPE.FRUIT),
                new Dish("Potato", true,300, TYPE.VEGETABLE),
                new Dish("Watermelon", true, 400, TYPE.FRUIT),
                new Dish("Nuts", true, 650, TYPE.OTHER),
                new Dish("Stake", false, 399, TYPE.MEAT));
        List<String> fatDishesNames = dishes.stream()
                .filter(d -> d.getType().equals(TYPE.MEAT))
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(fatDishesNames);
    }
}
