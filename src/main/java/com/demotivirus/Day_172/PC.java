package com.demotivirus.Day_172;

public class PC extends Computer {
    public PC(String ram, String hdd, String cpu) {
        super(ram, hdd, cpu);
    }

    @Override
    void printInfo() {
        System.out.println("This is PC");
        System.out.println(this);
    }
}
