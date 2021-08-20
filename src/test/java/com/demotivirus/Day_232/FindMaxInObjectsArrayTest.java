package com.demotivirus.Day_232;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.demotivirus.Day_232.Type.*;

class FindMaxInObjectsArrayTest {
    private Melon[] melons;
    private FindMaxInObjectsArray findMaxInObjectsArray;

    @BeforeEach
    void setUp() {
        melons = new Melon[] {
                new Melon(HONEY, 110),
                new Melon(YELLOW, 111),
                new Melon(HONEY, 110),
                new Melon(GOLD, 90)
        };

        findMaxInObjectsArray = new FindMaxInObjectsArray();
    }

    @Test
    void max() {
        assertEquals(new Melon(YELLOW, 111), findMaxInObjectsArray.max(melons));
    }
}