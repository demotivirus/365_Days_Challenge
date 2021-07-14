package com.demotivirus.Day_197;

import com.demotivirus.Day_197.apple.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample3 {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
          new Apple(80, "green"),
          new Apple(180, "red"),
          new Apple(280, "green")
        );

        List<Apple> greenApples = filterApples(apples, LambdaExample3::isGreenApple);
        List<Apple> heavyApples = filterApples(apples, LambdaExample3::isHeavyApple);

        System.out.println(greenApples);
        System.out.println(heavyApples);

        List<Apple> greenApples2 = filterApples(apples, apple -> "green".equals(apple.getColor())); //analog
        System.out.println(greenApples2);
    }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) { //new java
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple))
                result.add(apple);
        }
        return result;
    }

    public static List<Apple> filterGreenApples(List<Apple> apples) { //old java
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) { //old java
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150)
                result.add(apple);
        }
        return result;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }
}
