package com.demotivirus.Day_203;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExample5 {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(80, "red"),
                new Apple(80, "green"),
                new Apple(180, "red"),
                new Apple(280, "green")
        );

        apples.sort(Comparator.comparing((a) -> a.getWeight()));
        System.out.println(apples);

        apples.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(apples);

        apples.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(apples);

        apples.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getColor));
        System.out.println(apples);
    }
}
