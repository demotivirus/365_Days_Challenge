package com.demotivirus.Day_218;

public class SumTwoBigNumbers {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int z = x + y; //overflow
        System.out.println(z);

        z = Math.addExact(x, y); // if overflow - throw ArithmeticException
        System.out.println(z);
    }
}
