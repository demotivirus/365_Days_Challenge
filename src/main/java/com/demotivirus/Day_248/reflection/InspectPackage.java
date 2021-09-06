package com.demotivirus.Day_248.reflection;

import java.io.File;
import java.util.Arrays;

public class InspectPackage {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.Integer");
        System.out.println("Class name" + clazz.getName());

        Package pckgj = clazz.getPackage();
        System.out.println("Package name" + pckgj.getName());

        File file = new File(".");
        Package packageOfFile = file.getClass().getPackage();
        System.out.println("Package name" + packageOfFile.getName());

        Arrays.stream(Package.getPackages()).forEach(System.out::println);
    }
}
