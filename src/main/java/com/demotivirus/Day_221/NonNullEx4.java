package com.demotivirus.Day_221;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NonNullEx4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 5);
        System.out.println(sumIntegers(numbers));
        System.out.println(containsNull(numbers));
    }

    private static int sumIntegers(List<Integer> numbers) {
        if (Objects.isNull(numbers))
            throw new IllegalArgumentException("List can't be null");

        return numbers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static boolean containsNull(List<Integer> numbers) {
        if (Objects.isNull(numbers))
            return false;

        return numbers.stream()
                .anyMatch(Objects::isNull);
    }
}
