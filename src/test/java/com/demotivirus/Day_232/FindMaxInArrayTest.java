package com.demotivirus.Day_232;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxInArrayTest {
    private int[] arr;
    private FindMaxInArray findMaxInArray;

    @BeforeEach
    void setup() {
        arr = new int[] {5, 9, 0, 11, 85, 4, 8, 90, 111, -85};
        findMaxInArray = new FindMaxInArray();
    }

    @Test
    void findMax() {
        assertEquals(111, findMaxInArray.findMax(arr));
    }

    @Test
    void findMax2() {
        assertEquals(111, findMaxInArray.findMax2(arr));
    }
}