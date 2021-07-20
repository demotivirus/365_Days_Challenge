package com.demotivirus.Day_203;

import java.util.Arrays;
import java.util.List;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(80, "green"),
                new Apple(180, "red"),
                new Apple(280, "green")
        );

        apples.sort((a, b) -> a.getWeight().compareTo(b.getWeight()));
        System.out.println(apples);
    }
}
