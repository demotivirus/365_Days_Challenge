package com.demotivirus.Day_203;

import java.util.Arrays;
import java.util.List;

public class LambdaExample1 {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(80, "green"),
                new Apple(180, "red"),
                new Apple(280, "green")
        );
        apples.sort(new AppleComparator()); //not best practice
        System.out.println(apples); //sort for weight
    }
}
