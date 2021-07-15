package com.demotivirus.Day_198.defaulMeths;

public class InterfaceWithDefaultMethImpl implements InterfaceWithDefaultMeth, ConflictInterface {
    public void printHelloFromClass() {
        System.out.println("Hello from class meth");
    }

    @Override
    public void printHelloFromDefault() { //because is conflict. Static meth not conflicted
        InterfaceWithDefaultMeth.super.printHelloFromDefault();
    }
}
