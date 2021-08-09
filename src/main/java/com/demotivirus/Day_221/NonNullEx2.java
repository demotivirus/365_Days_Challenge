package com.demotivirus.Day_221;

import java.util.*;

public class NonNullEx2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 5);
        System.out.println(even(numbers));
    }

    private static List<Integer> even(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();
        if (Objects.isNull(numbers))
            return Collections.emptyList();

        for (Integer num : numbers) {
            if (Objects.nonNull(num) && num % 2 == 0)
                even.add(num);
        }

        return even;
    }
}
