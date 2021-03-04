package com.demotivirus.Day_073;

import lombok.ToString;

@ToString
public class CashFinalClass {
    private final int dollars;

    public CashFinalClass(int dollars){
        this.dollars = dollars;
    }

    public CashFinalClass mult(int factor){
        return new CashFinalClass(dollars * factor);
    }
}
