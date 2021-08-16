package com.demotivirus.Day_228.Tip_02;

import lombok.ToString;

@ToString
public class VeganBurger implements Item {
    @Override
    public String name() {
        return "vegan burger";
    }
}
