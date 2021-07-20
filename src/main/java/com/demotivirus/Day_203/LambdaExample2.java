package com.demotivirus.Day_203;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(80, "green"),
                new Apple(180, "red"),
                new Apple(280, "green")
        );

        apples.sort(new Comparator<Apple>() { //sort with anonymous class
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });

        System.out.println(apples);
    }
}
