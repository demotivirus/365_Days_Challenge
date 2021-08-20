package com.demotivirus.Day_232;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAverageTest {
    private int[] arr;
    private ArrayAverage arrayAverage;

    @BeforeEach
    void setUp() {
        arr = new int[] {5, 9, 0, 11, 85, 4, 8, 90, 111, 11};
        arrayAverage = new ArrayAverage();
    }

    @Test
    void findAverage() {
        assertEquals(33.4, arrayAverage.findAverage(arr));
    }
}