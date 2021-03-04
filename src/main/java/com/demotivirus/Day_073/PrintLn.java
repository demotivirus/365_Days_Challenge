package com.demotivirus.Day_073;

public class PrintLn {
    private final String origin;

    public PrintLn(String source){
        this.origin = source;
    }

    @Override
    public String toString(){
        return String.format("%s\r\n", origin);
    }
}
