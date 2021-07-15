package com.demotivirus.Day_198;

import com.demotivirus.Day_197.apple.Apple;
import com.demotivirus.Day_198.defaulMeths.InterfaceWithDefaultMeth;
import com.demotivirus.Day_198.defaulMeths.InterfaceWithDefaultMethImpl;
import com.demotivirus.Day_198.lambdas.ApplePredicate;
import com.demotivirus.Day_198.lambdas.AppleRedAndHeavyPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InterfaceWithDefaultMethImpl impl = new InterfaceWithDefaultMethImpl();
        impl.printHelloFromDefault();
        impl.printHelloFromClass();
        InterfaceWithDefaultMeth.staticMethInterface();
        System.out.println("=========================");

        List<Apple> apples = Arrays.asList(
                new Apple(80, "green"),
                new Apple(180, "red"),
                new Apple(280, "green")
        );

        List<Apple> readAndHeavyApples = filterApples(apples, new AppleRedAndHeavyPredicate());
        System.out.println(readAndHeavyApples);
    }

    private static List<Apple> filterApples(List<Apple> apples, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (applePredicate.test(apple))
                result.add(apple);
        }
        return result;
    }
}
