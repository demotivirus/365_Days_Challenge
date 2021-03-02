package com.demotivirus.Day_071;

import lombok.Data;

@Data
public class App {
    private String data;
    private String scanner;

    public App(String data, String scanner){
        this.data = data;
        this.scanner = scanner;
    }

    public void run(){
        System.out.format("%s_%s", data, scanner);
        System.out.println();
    }
}
