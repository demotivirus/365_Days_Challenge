package com.demotivirus.Day_073;

import lombok.ToString;

@ToString
public class Cash {
    private final int dollars;
    private final int cents;

    public Cash(int dollars, int cents){
        this.dollars = dollars;
        this.cents = cents;
    }

    @Override
    public String toString() {
        return "$" + dollars +
                "." + cents;
    }
}
