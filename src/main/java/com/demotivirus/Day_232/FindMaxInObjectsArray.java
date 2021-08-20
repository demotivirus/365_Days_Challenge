package com.demotivirus.Day_232;

public class FindMaxInObjectsArray {
    public <T extends Comparable<T>> T max(T[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("Array is empty!");

        T max = arr[0];
        for (T element : arr) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }
}
