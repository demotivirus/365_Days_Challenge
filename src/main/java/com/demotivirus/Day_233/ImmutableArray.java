package com.demotivirus.Day_233;

import lombok.Data;

import java.util.Arrays;

@Data
public class ImmutableArray<T> {
    private final T[] array;

    private ImmutableArray(T[] a) {
        array = Arrays.copyOf(a, a.length);
    }

    public static <T> ImmutableArray<T> from(T[] a) {
        return new ImmutableArray<>(a);
    }

    public T get(int index) {
        return array[index];
    }
}
