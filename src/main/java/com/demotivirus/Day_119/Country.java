package com.demotivirus.Day_119;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Country {
    private List<Town> towns = new ArrayList<>();

    public void addTown(Town town){
        towns.add(town);
    }
}
