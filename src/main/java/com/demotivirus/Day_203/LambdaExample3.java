package com.demotivirus.Day_203;

import java.util.Arrays;
import java.util.List;

public class LambdaExample3 {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(80, "green"),
                new Apple(180, "red"),
                new Apple(280, "green")
        );

        apples.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(apples);
    }
}
