package com.demotivirus.Day_249.reflection;

import java.util.Arrays;

public class GetInterfaces {
    public static void main(String[] args) {
        Pair pair = new Pair(1, 1);
        Class<?>[] interfaces = pair.getClass().getInterfaces();
        System.out.println(Arrays.toString(interfaces));

        for (Class c : interfaces) {
            System.out.println("Simple interface name: " + c.getSimpleName());
        }
    }
}
