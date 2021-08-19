package com.demotivirus.Day_231;

import java.util.Arrays;
import java.util.Comparator;

public class FindInObjectArray {
    public <T> boolean contains(T[] objects, T t) {
        return Arrays.stream(objects)
                .anyMatch(t1 -> t1.equals(t));
    }

    public <T> boolean containsTwo(T[] arr, T toContain, Comparator<? super T> comparator) {
        Arrays.sort(arr, comparator);
        int index = Arrays.binarySearch(arr, toContain, comparator);
        return index >= 0;
    }
}
