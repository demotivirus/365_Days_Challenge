package com.demotivirus.Day_233;

import java.util.Arrays;

public class NewSizeInArray {
    public int[] addElementAndFillArray(int[] arr, int element) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = element; //add element in end
        return newArr;
    }

    public int[] updateArrayForSize(int[] arr, int length) {
        int[] newArr = Arrays.copyOf(arr, arr.length + length);
        return newArr;
    }
}
