package com.demotivirus.Day_233;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewSizeInArrayTest {
    private int[] arr;
    private NewSizeInArray newSizeInArray;

    @BeforeEach
    void setUp() {
        arr = new int[] {4, 4, 6, 8, 2, 6};
        newSizeInArray = new NewSizeInArray();
    }

    @Test
    void newArr() {
        assertEquals(7, newSizeInArray.addElementAndFillArray(arr, 4).length);
    }

    @Test
    void updateArrayForSize() {
        assertEquals(10, newSizeInArray.updateArrayForSize(arr, 4).length);
        assertEquals(15, newSizeInArray.updateArrayForSize(arr, 9).length);
    }
}