package com.demotivirus.Day_079;

import lombok.Data;

@Data
public class ConcreteJson implements Json {
    private String message;

    @Override
    public void printJson(String message) {
        this.message = message;
        System.out.println("{message: " + "\"" + message + "\"}");
    }
}
