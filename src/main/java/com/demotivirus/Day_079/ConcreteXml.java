package com.demotivirus.Day_079;

import lombok.Data;

@Data
public class ConcreteXml implements Xml {
    private String message;

    @Override
    public void printXml(String message) {
        this.message = message;
        System.out.println("<message>" + message + "</message>");
    }
}
