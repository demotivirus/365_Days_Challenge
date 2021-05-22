package com.demotivirus.Day_147;

public class Factory {
    public static Notebook create(int numOfPages) {
        if (numOfPages < 100) {
            return new Notebook(numOfPages);
        }
        else return new Notebook(100);
    }
}
