package com.demotivirus.Day_144;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Debug log: " + request);
    }
}
