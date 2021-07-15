package com.demotivirus.Day_198.defaulMeths;

public interface InterfaceWithDefaultMeth {
    default void printHelloFromDefault() {
        System.out.println("Hello from default meth from InterfaceWithDefaultMeth");
    }

    static void staticMethInterface() {
        System.out.println("Hello from static meth");
    }
}
