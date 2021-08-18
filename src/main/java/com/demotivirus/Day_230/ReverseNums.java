package com.demotivirus.Day_230;

import java.util.Arrays;
import java.util.Collections;

public class ReverseNums {
    public static void main(String[] args) {
        Integer[] array = {8, 9, 0, -1};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
    }
}