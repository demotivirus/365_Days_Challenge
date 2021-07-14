package com.demotivirus.Day_197;

import com.demotivirus.Day_197.apple.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(80, "green"),
                new Apple(180, "red"),
                new Apple(280, "green")
        );

        List<Apple> heavyApples =
                apples.stream().filter((Apple a) -> a.getWeight() > 150)
                        .collect(Collectors.toList());
        System.out.println(heavyApples);

        List<Apple> parallel = apples.parallelStream().filter(a -> a.getWeight() > 150)
                .collect(Collectors.toList());
        System.out.println(parallel);
    }
}
