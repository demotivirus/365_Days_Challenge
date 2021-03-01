package com.demotivirus.Day_070;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CashedNum extends Number{
    private Number origin;
    private List<Integer> cashed = new ArrayList<>(1);

    public CashedNum(Number number){
        this.origin = number;
    }

    public CashedNum(String number){
        this.origin = new StringAsInteger(number);
    }

    @Override
    public int intValue() {
        if (cashed.isEmpty())
            cashed.add(origin.intValue());
        return cashed.get(0);
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
