package com.demotivirus.Day_206;

import com.demotivirus.Day_204.Dish;
import com.demotivirus.Day_204.TYPE;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample5 {
    public static void main(String[] args) {
        List<Dish> dishes = List.of(new Dish("Bananas", true, 200, TYPE.FRUIT),
                new Dish("Potato", true,300, TYPE.VEGETABLE),
                new Dish("Watermelon", true, 400, TYPE.FRUIT),
                new Dish("Nuts", true, 650, TYPE.OTHER),
                new Dish("Stake", false, 399, TYPE.MEAT));

        List<Integer> length = dishes.stream()
                .map(Dish::getName)
                .map(String::length)//enter dishes names length
                .collect(Collectors.toList());
        System.out.println(length);
    }
}
