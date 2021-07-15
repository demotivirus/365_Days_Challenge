package com.demotivirus.Day_198.lambdas;

import com.demotivirus.Day_197.apple.Apple;

public class AppleGreenPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
