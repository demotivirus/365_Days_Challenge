package com.demotivirus.Day_145;

public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service 1";
    }

    @Override
    public void execute() {
        System.out.println("Execute Service 1");
    }
}
