package com.demotivirus.Day_071;

//Aggressive constructor is bad
public class AggressiveConstructor {
    private String toUpperCase;

    public AggressiveConstructor(String string){
        this.toUpperCase = string.toUpperCase();
    }

    @Override
    public String toString() {
        return toUpperCase;
    }
}
