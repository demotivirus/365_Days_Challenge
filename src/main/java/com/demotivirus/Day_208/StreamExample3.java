package com.demotivirus.Day_208;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 6);

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        BinaryOperator<Integer> binarySum = (a, b) -> a + b;
        Stream<Integer> stream = numbers.stream();
        System.out.println(stream.reduce(0, binarySum));
        System.out.println(numbers.stream().reduce(0, Integer::sum));

        BinaryOperator<Integer> binaryProduct = (a, b) -> a * b;
        System.out.println(numbers.stream().reduce(1, binaryProduct));
    }
}
