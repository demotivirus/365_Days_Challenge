package com.demotivirus.Day_204;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Dish> dishes = List.of(new Dish("Bananas", true, 200, TYPE.FRUIT),
                new Dish("Potato", true,300, TYPE.VEGETABLE),
                new Dish("Watermelon", true, 400, TYPE.FRUIT),
                new Dish("Nuts", true, 650, TYPE.OTHER),
                new Dish("Stake", false, 399, TYPE.MEAT));

        List<String> lowCaloriesNames = dishes.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName) //get names from Dish
                .collect(Collectors.toList());
        System.out.println(lowCaloriesNames);

        List<String> lowCaloriesNamesParallel = dishes.parallelStream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName) //get names from Dish
                .collect(Collectors.toList());
        System.out.println(lowCaloriesNamesParallel);
    }
}
