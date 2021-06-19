package com.demotivirus.Day_173;

import java.util.Arrays;

public class ArraysChipsAndTricks {
    public static void main(String[] args) {
        String key = "from";
        String question = "Where are you? I go to home Jhon!";
        //String[] arr = question.split(" ");
        String[] arr = new String[]{"hello", "are", "you", "from", "hi"};
        int index = Arrays.binarySearch(arr, key);
        System.out.println("Word index is: " + index); //bug binary search :{

        String[] firstArr = question.split(" ");
        String[] secondArr = question.split(" ");
        System.out.println("Arrays is equal? " + Arrays.deepEquals(firstArr, secondArr));

        int[] intArray = new int[5];
        Arrays.fill(intArray, 99); //fill array new values
        System.out.println(Arrays.toString(intArray));
    }
}
