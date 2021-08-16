package com.demotivirus.Day_228.Tip_02;

import lombok.ToString;

@ToString
public class ChickenBurger implements Item {
    @Override
    public String name() {
        return "chicken burger";
    }
}
