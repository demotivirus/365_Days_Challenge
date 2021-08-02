package com.demotivirus.Day_214_215.Tip_02;

import com.demotivirus.Day_209_211.Tip_02.Item;
import lombok.ToString;

@ToString
public class VeganBurger implements Item {
    @Override
    public String name() {
        return "vegan burger";
    }
}
