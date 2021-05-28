package com.demotivirus.Day_153;

import org.springframework.stereotype.Component;

@Component
public class HelloImpl implements Hello{
    public void sayHello() {
        System.out.println("Hello");
    }
}
