package com.demotivirus.Day_172;

public class Server extends Computer {
    public Server(String ram, String hdd, String cpu) {
        super(ram, hdd, cpu);
    }

    @Override
    void printInfo() {
        System.out.println("This is server");
        System.out.println(this);
    }
}
