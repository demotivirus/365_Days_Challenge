package com.demotivirus.Day_201;

import java.util.function.Function;

public class LambdaExample2 {
    public static void main(String[] args) {
        Function<Integer, Apple> function = Apple::new; //create obj with int constructor
        Apple apple = function.apply(200);
        System.out.println(apple);
    }
}
