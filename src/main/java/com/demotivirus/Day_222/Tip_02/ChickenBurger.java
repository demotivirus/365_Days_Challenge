package com.demotivirus.Day_222.Tip_02;

import lombok.ToString;

@ToString
public class ChickenBurger implements Item {
    @Override
    public String name() {
        return "chicken burger";
    }
}
