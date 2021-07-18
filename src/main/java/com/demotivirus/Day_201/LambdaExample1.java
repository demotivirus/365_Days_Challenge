package com.demotivirus.Day_201;

import java.util.function.Supplier;

public class LambdaExample1 {
    public static void main(String[] args) {
        Supplier<Apple> supplier = Apple::new; //create obj without arguments
        Apple apple = supplier.get();
        System.out.println(apple);
    }
}
