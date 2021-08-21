package com.demotivirus.Day_233;

import java.util.Arrays;

public class DeleteLastElementInArray {
    public int[] deleteLast(int[] arr) {
        return Arrays.copyOf(arr, arr.length - 1);
    }
}
