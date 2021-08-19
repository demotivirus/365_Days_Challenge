package com.demotivirus.Day_231;

import java.util.Arrays;

public class FindInArray {
//    public static void main(String[] args) {
//        int[] numbers = {1, 8, 11, 64, 0, 11};
//        System.out.println(containsElement(numbers, 0));
//        System.out.println(containsElementTwo(numbers, 0));
//    }

    public boolean containsElement(int[] array, int element) {
        for (int a : array) {
            if (a == element)
                return true;
        }

        return false;
    }

    public boolean containsElementTwo(int[] array, int element) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, element);
        return index >= 0;
    }

    public boolean containsElementThree(int[] array, int element) {
        return Arrays.stream(array)
                .anyMatch(value -> value == element);
    }
}
