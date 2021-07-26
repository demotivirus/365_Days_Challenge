package com.demotivirus.Day_208;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 6);
        Optional<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n % 3 == 0)
                .findFirst();
        System.out.println(squares);
    }
}
