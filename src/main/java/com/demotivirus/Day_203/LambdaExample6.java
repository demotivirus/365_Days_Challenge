package com.demotivirus.Day_203;

import java.util.function.Function;

public class LambdaExample6 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;
        Function<Integer, Integer> h = f.andThen(g); // (x + 1) * 2
        System.out.println(h.apply(2));
        System.out.println(h.apply(20));

        h = f.compose(g); // (x * 2 + 1)
        System.out.println(h.apply(2));
        System.out.println(h.apply(20));
    }
}
