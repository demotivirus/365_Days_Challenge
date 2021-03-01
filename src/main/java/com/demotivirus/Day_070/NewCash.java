package com.demotivirus.Day_070;

public class NewCash {
    private Number dollars;

    public NewCash(String dollars){
        this.dollars = new StringAsInteger(dollars);
    }

    @Override
    public String toString() {
        return "NewCash{" +
                "dollars=" + dollars.intValue() +
                '}';
    }
}
