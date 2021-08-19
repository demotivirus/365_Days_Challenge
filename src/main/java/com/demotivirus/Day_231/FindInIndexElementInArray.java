package com.demotivirus.Day_231;

import java.util.stream.IntStream;

public class FindInIndexElementInArray {
    public int findInArray(int[] arr, int element) {
        return IntStream.range(0, arr.length)
                .filter(i -> arr[i] == element)
                .findFirst()
                .orElse(-1);
    }
}
