package com.demotivirus.Day_163.constatnts;

public enum ThreadConst {
    VALIDATION(3_000),
    ASYNCHRONOUS(10_000);

    private int seconds;

    ThreadConst(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
}
