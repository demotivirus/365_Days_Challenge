package com.demotivirus.Day_145;

public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service 2";
    }

    @Override
    public void execute() {
        System.out.println("Execute service 2");
    }
}
