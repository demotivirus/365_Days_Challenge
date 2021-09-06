package com.demotivirus.Day_248.reflection;

import java.util.Set;

public class InspectPackagesFromModules {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Set<String> packages = manager.getClass().getModule().getPackages();
        packages.stream().forEach(System.out::println);
    }
}
