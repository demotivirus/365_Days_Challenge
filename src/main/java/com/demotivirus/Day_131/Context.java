package com.demotivirus.Day_131;

import com.demotivirus.Day_131.strategy.Strategy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Context {
    private Strategy strategy;

    public int execute(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
