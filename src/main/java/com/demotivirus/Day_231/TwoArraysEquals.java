package com.demotivirus.Day_231;

import java.util.Arrays;

public class TwoArraysEquals {
    public boolean isEqual(int[] firstArr, int[] secondArr) {
        return Arrays.equals(firstArr, secondArr);
    }

    public <T> boolean isEqual(T[] firstArr, T[] secondArr) {
        return Arrays.equals(firstArr, secondArr);
    }
}
