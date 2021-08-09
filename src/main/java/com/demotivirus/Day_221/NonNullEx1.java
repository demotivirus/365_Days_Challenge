package com.demotivirus.Day_221;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonNullEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, null, 4, null, 5);
    }

    private static List<Integer> even(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();
        if (numbers == null)
            return Collections.emptyList();

        for (Integer num : numbers) {
            if (num % 2 == 0)
                even.add(num);
        }

        return even;
    }
}
