package com.demotivirus.Day_231;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindInArrayTest {
    private int[] numbers;
    private FindInArray findInArray;

    @BeforeEach
    void setUp() {
        numbers = new int[]{1, 8, 11, 64, 0, 11};
        findInArray = new FindInArray();
    }

    @Test
    void containsElement() {
        assertEquals(true, findInArray.containsElement(numbers, 0));
    }

    @Test
    void containsElementTwo() {
        assertEquals(true, findInArray.containsElementTwo(numbers, 11));
    }

    @Test
    void containsElementThree() {
        assertEquals(true, findInArray.containsElementThree(numbers, 8));
        assertEquals(false, findInArray.containsElementThree(numbers, 14));
        assertEquals(true, findInArray.containsElementThree(numbers, 0));
    }
}