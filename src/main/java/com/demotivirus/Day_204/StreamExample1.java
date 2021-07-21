package com.demotivirus.Day_204;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Dish> dishes = List.of(new Dish("Bananas", true, 200, TYPE.FRUIT),
                new Dish("Potato", true,300, TYPE.VEGETABLE),
                new Dish("Watermelon", true, 400, TYPE.FRUIT),
                new Dish("Nuts", true, 650, TYPE.OTHER),
                new Dish("Stake", false, 399, TYPE.MEAT));
        dishes = lowCaloriesSort(dishes);
        System.out.println(dishes);
    }

    private static List<Dish> lowCaloriesSort(List<Dish> dishes) {
        List<Dish> result = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getCalories() < 400)
                result.add(dish);
        }

        Collections.sort(result, Comparator.comparing(Dish::getCalories));
        return result;
    }
}
