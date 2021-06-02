package com.demotivirus.Day_158;

import java.util.function.Function;

public class FunctionTest1 {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> hardCode =
                one -> two -> three -> one + two + three;

        int res = hardCode.apply(2).apply(3).apply(4);
        System.out.println(res);
    }
}
