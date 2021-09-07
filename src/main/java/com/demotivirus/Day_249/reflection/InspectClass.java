package com.demotivirus.Day_249.reflection;

public class InspectClass {
    public static void main(String[] args) {
        Pair pair = new Pair(1, 1);
        Class<?> clazz = pair.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getCanonicalName());
    }
}
