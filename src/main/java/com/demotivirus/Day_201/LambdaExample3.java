package com.demotivirus.Day_201;

import java.util.function.BiFunction;

public class LambdaExample3 {
    public static void main(String[] args) {
        BiFunction<Color, Integer, Apple> biFunction = Apple::new;
        Apple apple = biFunction.apply(Color.RED, 200);
        System.out.println(apple);
    }
}
