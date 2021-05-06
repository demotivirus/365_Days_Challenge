package com.demotivirus.Day_133;

public class ReflectionIntro {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classString = Class.forName("java.lang.String");
        System.out.println(classString.getSimpleName());
        System.out.println(classString.getCanonicalName());
        System.out.println(classString.getTypeName());

        System.out.println();

        Class<Integer> classInt = int.class;
        System.out.println(classInt.getName());
    }
}
