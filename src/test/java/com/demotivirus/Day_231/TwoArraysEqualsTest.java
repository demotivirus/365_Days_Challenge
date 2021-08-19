package com.demotivirus.Day_231;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.demotivirus.Day_231.Type.*;
import static org.junit.jupiter.api.Assertions.*;

class TwoArraysEqualsTest {
    private int[] firstArr, secondArr;
    private TwoArraysEquals twoArraysEquals;

    private Melon[] melons1;
    private Melon[] melons2;
    private Melon[] melons3;

    @BeforeEach
    private void setup() {
        firstArr = new int[] {1, 16, 90, 56, 78, 11};
        secondArr = new int[] {1, 16, 90, 56, 78, 11};
        twoArraysEquals = new TwoArraysEquals();

        melons1 = new Melon[] {
                new Melon(BLACK, 110),
                new Melon(YELLOW, 111),
                new Melon(BLACK, 110),
                new Melon(GREEN, 90)
        };

        melons2 = new Melon[] {
                new Melon(BLACK, 110),
                new Melon(YELLOW, 111),
                new Melon(BLACK, 110),
                new Melon(GREEN, 90)
        };

        melons3 = new Melon[] {
                new Melon(BLACK, 110),
                new Melon(YELLOW, 111),
                new Melon(BLACK, 110),
                //new Melon(GREEN, 90)
        };
    }

    @Test
    void isEqual() {
        assertEquals(true, twoArraysEquals.isEqual(firstArr, secondArr));
        assertEquals(true, twoArraysEquals.isEqual(melons1, melons2));
        assertEquals(false, twoArraysEquals.isEqual(melons1, melons3));
    }
}