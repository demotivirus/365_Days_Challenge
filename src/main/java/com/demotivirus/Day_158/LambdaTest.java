package com.demotivirus.Day_158;

public class LambdaTest {
    public static void main(String[] args) {
        MathOperation sum = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(sum.operation(1, 8));
        System.out.println(subtract.operation(6, 6));
        System.out.println(multiplication.operation(5, 5));
        System.out.println(division.operation(8, 2));
    }
}
