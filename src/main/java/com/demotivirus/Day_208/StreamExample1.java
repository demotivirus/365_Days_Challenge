package com.demotivirus.Day_208;

import com.demotivirus.Day_204.Dish;
import com.demotivirus.Day_204.TYPE;

import java.util.List;
import java.util.Optional;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Dish> dishes = List.of(new Dish("Bananas", true, 200, TYPE.FRUIT),
                new Dish("Potato", true,300, TYPE.VEGETABLE),
                new Dish("Watermelon", true, 400, TYPE.FRUIT),
                new Dish("Nuts", true, 650, TYPE.OTHER),
                new Dish("Stake", false, 399, TYPE.MEAT));
        Optional<Dish> anyVegan = dishes.stream().filter(Dish::isVegan).findAny();
        System.out.println(anyVegan.get());

        dishes.stream()
                .filter(Dish::isVegan)
                .findAny()
                .ifPresent(d -> System.out.println(d.getName()));
    }
}
