package com.demotivirus.Day_131.strategy;

public class OperationDivision implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 / num2;
    }
}
