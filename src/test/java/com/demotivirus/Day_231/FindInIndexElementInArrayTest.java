package com.demotivirus.Day_231;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindInIndexElementInArrayTest {
    private int[] numbers;
    private FindInIndexElementInArray findInIndexElementInArray;

    @BeforeEach
    void setup() {
        numbers = new int[]{1, 8, 11, 64, 0, 11};
        findInIndexElementInArray = new FindInIndexElementInArray();
    }

    @Test
    void findInArray() {
        assertEquals(2, findInIndexElementInArray.findInArray(numbers, 11));
        assertEquals(-1, findInIndexElementInArray.findInArray(numbers, 15));
    }
}