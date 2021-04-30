package com.demotivirus.Day_128;

import lombok.ToString;

@ToString
public class NullCustomer extends AbstractCustomer {
    private String name;

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
