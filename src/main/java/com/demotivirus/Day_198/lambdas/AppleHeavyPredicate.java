package com.demotivirus.Day_198.lambdas;

import com.demotivirus.Day_197.apple.Apple;

public class AppleHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
