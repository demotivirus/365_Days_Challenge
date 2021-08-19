package com.demotivirus.Day_231;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static com.demotivirus.Day_231.Type.*;
import static org.junit.jupiter.api.Assertions.*;

class FindInObjectArrayTest {
    private Melon[] melons;
    private FindInObjectArray findInObjectArray;

    @BeforeEach
    void setup() {
        melons = new Melon[] {
                new Melon(BLACK, 110),
                new Melon(YELLOW, 111),
                new Melon(BLACK, 110),
                new Melon(GREEN, 90)
        };

        findInObjectArray = new FindInObjectArray();
    }

    @Test
    void contains() {
        assertEquals(true, findInObjectArray.contains(melons, new Melon(GREEN, 90)));
    }

    @Test
    void containsTwo() {
        Comparator<Melon> compareByWeigh = Comparator.comparing(Melon::getWeight);
        assertEquals(true, findInObjectArray.containsTwo(melons, new Melon(BLACK, 110), compareByWeigh));
        assertEquals(false, findInObjectArray.containsTwo(melons, new Melon(GREEN, 180), compareByWeigh));
    }
}