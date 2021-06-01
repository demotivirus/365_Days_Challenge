package com.demotivirus.Day_157;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        Integer[] intArrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> listIntegers = new ArrayList<>(Arrays.asList(intArrays));

        listIntegers.stream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        listIntegers.parallelStream().forEach(e -> System.out.print(e + " "));
        System.out.println();

        listIntegers.stream().parallel().forEach(e -> System.out.print(e + " "));
        System.out.println();

        listIntegers.parallelStream().forEachOrdered(e -> System.out.print(e + " "));
        System.out.println();
    }
}
