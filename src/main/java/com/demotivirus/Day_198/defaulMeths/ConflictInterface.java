package com.demotivirus.Day_198.defaulMeths;

public interface ConflictInterface {
    default void printHelloFromDefault() {
        System.out.println("Hello from default meth");
    }

    static void staticMethInterface() {
        System.out.println("Hello from static meth");
    }
}
