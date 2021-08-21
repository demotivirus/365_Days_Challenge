package com.demotivirus.Day_233;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteLastElementInArrayTest {
    private int[] arr;
    private DeleteLastElementInArray deleteLastElementInArray;

    @BeforeEach
    void setUp() {
        arr = new int[] {4, 4, 6, 8, 2, 6};
        deleteLastElementInArray = new DeleteLastElementInArray();
    }

    @Test
    void deleteLast() {
        assertEquals(5, deleteLastElementInArray.deleteLast(arr).length);
    }
}