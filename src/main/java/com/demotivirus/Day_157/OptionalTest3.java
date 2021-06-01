package com.demotivirus.Day_157;

import java.util.Optional;
import java.util.function.Function;

public class OptionalTest3 {
    public static void main(String[] args) {
        Function<Integer, Optional<Integer>> addOne = x -> Optional.of(x + 1);
        Function<Integer, Optional<Integer>> addTwo = x -> Optional.of(x + 2);
        Function<Integer, Optional<Integer>> addThree = x -> addOne.apply(x).flatMap(addTwo);

        System.out.println(Optional.of(5).flatMap(addOne).flatMap(addTwo));
    }
}
