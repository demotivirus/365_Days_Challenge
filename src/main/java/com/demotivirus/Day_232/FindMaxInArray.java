package com.demotivirus.Day_232;

import java.util.Arrays;

public class FindMaxInArray {
    public int findMax(int[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("Array is empty!");

        int max = arr[0];
        for (int element : arr) {
            if (element > max) {
                //max = element;
                max = Math.max(max, element);
            }
        }

        return max;
    }

    public int findMax2(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
