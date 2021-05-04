package com.demotivirus.Day_131;

import com.demotivirus.Day_131.strategy.OperationAdd;
import com.demotivirus.Day_131.strategy.OperationDivision;
import com.demotivirus.Day_131.strategy.OperationMultiply;
import com.demotivirus.Day_131.strategy.OperationSubstract;

public class Main {
    public static void main(String[] args) {
        Context add = new Context(new OperationAdd());
        Context substract = new Context(new OperationSubstract());
        Context multiply = new Context(new OperationMultiply());
        Context division = new Context(new OperationDivision());

        int num1 = 10;
        int num2 = 5;

        System.out.println("10 + 5 = " + add.execute(num1, num2));
        System.out.println("10 - 5 = " + substract.execute(num1, num2));
        System.out.println("10 * 5 = " + multiply.execute(num1, num2));
        System.out.println("10 / 5 = " + division.execute(num1, num2));
    }
}
