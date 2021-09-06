package com.demotivirus.Day_248.reflection;

import java.util.Arrays;

public class AllFilesInJavaClassLoader {
    public static void main(String[] args) {
        Arrays.stream(Package.getPackages()).forEach(System.out::println);
    }
}
