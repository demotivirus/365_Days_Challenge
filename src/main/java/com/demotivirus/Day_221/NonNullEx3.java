package com.demotivirus.Day_221;

import java.util.*;

public class NonNullEx3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 5);
        System.out.println(sumIntegers(numbers));
    }

    private static int sumIntegers(List<Integer> numbers) {
        if (Objects.isNull(numbers))
            throw new IllegalArgumentException("List can't be null");

        return numbers.stream()
                .filter(n -> n != null)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
