package com.demotivirus.Day_158;

import java.util.stream.IntStream;

public class FunctionalTest2 {
    public static void main(String[] args) {
        //1 * 2 * 3 * 4 * 5
        int product = IntStream.range(1, 5)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(-1);
        System.out.println(product);

        //1 + 2 + 3 + 4 + 5
        int sum = IntStream.range(1, 5).sum();
        System.out.println(sum);
    }
}
