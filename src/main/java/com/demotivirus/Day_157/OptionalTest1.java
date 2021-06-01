package com.demotivirus.Day_157;

import java.util.Optional;
import java.util.function.Function;

public class OptionalTest1 {
    public static void main(String[] args) {
        Function<Integer, Optional<Integer>> add = x -> Optional.of(x + 1);
        System.out.println(Optional.of(5).flatMap(add));
        System.out.println(add.apply(5));
    }
}
