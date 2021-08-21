package com.demotivirus.Day_233;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableArrayTest {
    private String[] arr;
    private ImmutableArray immutableArray;

    @BeforeEach
    void setup() {
        this.arr = new String[] {"a", "b", "c"};
    }

    @Test
    void from() {
        immutableArray = ImmutableArray.from(arr);
    }
}