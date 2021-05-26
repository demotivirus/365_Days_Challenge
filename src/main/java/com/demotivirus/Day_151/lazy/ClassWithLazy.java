package com.demotivirus.Day_151.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassWithLazy {
    private Lazy lazy;

    @org.springframework.context.annotation.Lazy
    @Autowired
    public ClassWithLazy(Lazy lazy) {
        this.lazy = lazy;
        System.err.println("Class with lazy field. Where lazy bean not create");
    }
}
