package com.demotivirus.Day_119;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Town {
    private List<Street> streets = new ArrayList<>();

    public void addStreet(Street street){
        streets.add(street);
    }
}
