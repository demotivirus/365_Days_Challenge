package com.demotivirus.Day_206;

import com.demotivirus.Day_204.Dish;
import com.demotivirus.Day_204.TYPE;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Dish> dishes = List.of(new Dish("Bananas", true, 200, TYPE.FRUIT),
                new Dish("Potato", true,300, TYPE.VEGETABLE),
                new Dish("Watermelon", true, 400, TYPE.FRUIT),
                new Dish("Nuts", true, 650, TYPE.OTHER),
                new Dish("Stake", false, 399, TYPE.MEAT));

        List<Dish> sortedDishes = dishes.stream()
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList());

        System.out.println(sortedDishes);
        System.out.println("=========");

        List<Dish> slicedMenu1 = sortedDishes.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());
        System.out.println(slicedMenu1);
        System.out.println("=========");

        List<Dish> slicedMenu2 = sortedDishes.stream()
                .dropWhile(dish -> dish.getCalories() < 320) //find MORE then 320 ccal
                .collect(Collectors.toList());
        System.out.println(slicedMenu2);
    }
}
