package com.demotivirus.Day_151.lazy;

import org.springframework.stereotype.Component;

@Component
@org.springframework.context.annotation.Lazy
public class Lazy {
    public Lazy() {
        System.err.println("Lazy class init");
    }
}
