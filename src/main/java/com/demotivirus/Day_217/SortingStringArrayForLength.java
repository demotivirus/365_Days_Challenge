package com.demotivirus.Day_217;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStringArrayForLength {
    public static void main(String[] args) {
        String[] strs = {"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "goood"};

        sortArrayByLength(strs, "ASC");
        System.out.println(Arrays.asList(strs));
        sortArrayByLengthToo(strs, "DESC");
        System.out.println(Arrays.asList(strs));
    }

    private static void sortArrayByLength(String[] strings, String direction) {
        if (direction.equalsIgnoreCase("ASC")) {
            Arrays.sort(strings, ((o1, o2) -> Integer.compare(o1.length(), o2.length())));
        }
        else {
            Arrays.sort(strings, (o1, o2) -> -1 * Integer.compare(o1.length(), o2.length()));
        }
    }

    private static void sortArrayByLengthToo(String[] strings, String direction) {
        if (direction.equalsIgnoreCase("ASC")) {
            Arrays.sort(strings, (Comparator.comparingInt(String::length)));
        }
        else {
            Arrays.sort(strings, (Comparator.comparingInt(String::length).reversed()));
        }
    }
}
