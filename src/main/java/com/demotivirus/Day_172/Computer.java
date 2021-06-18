package com.demotivirus.Day_172;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public abstract class Computer {
    protected String ram;
    protected String hdd;
    protected String cpu;
    abstract void printInfo();
}
