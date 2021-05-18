package com.demotivirus.Day_144;

public class AuthFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Auth request: " + request);
    }
}
