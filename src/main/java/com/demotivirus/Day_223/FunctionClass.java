package com.demotivirus.Day_223;

import java.util.Objects;

public class FunctionClass {
    private final int x;
    private int y;
    private final int X_UPPER_BOUND = 11;
    private final int Y_UPPER_BOUND = 16;

    public FunctionClass(int x) {
        if (x < 0 || x > X_UPPER_BOUND)
            throw new IllegalArgumentException("X IS UPPERBOUND");
        this.x = x;
    }

    public FunctionClass(int x, int y) {
        this.x = Objects.checkIndex(x, X_UPPER_BOUND);
        this.y = Objects.checkIndex(y, Y_UPPER_BOUND);
    }
}
