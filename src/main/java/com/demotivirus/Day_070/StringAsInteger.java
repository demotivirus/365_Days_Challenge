package com.demotivirus.Day_070;

import lombok.ToString;

@ToString
public class StringAsInteger extends Number {
    private String source;

    public StringAsInteger(String source){
        this.source = source;
    }

    @Override
    public int intValue() {
        return Integer.parseInt(this.source);
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
