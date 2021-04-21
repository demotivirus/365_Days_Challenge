package com.demotivirus.Day_119;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class World {
    private List<Country> countries = new ArrayList<>();

    public void addCountry(Country country){
        countries.add(country);
    }
}
