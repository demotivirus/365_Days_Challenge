package com.demotivirus.Day_232;

public class ArrayAverage {
    public double findAverage(int[] arr) {
        if (arr == null)
            throw new IllegalArgumentException("Array is empty!");

        return sum(arr) / arr.length;
    }

    private double sum(int[] arr) {
        double sum = 0;

        for (int element : arr) {
            sum += element;
        }

        return sum;
    }
}
