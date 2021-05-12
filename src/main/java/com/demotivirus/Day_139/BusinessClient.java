package com.demotivirus.Day_139;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BusinessClient {
    private BusinessDelegate businessDelegate;

    public void doTask() {
        businessDelegate.doTask();
    }
}
