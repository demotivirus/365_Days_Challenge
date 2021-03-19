package com.demotivirus.Day_088;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ToString
public class CityComposite implements Building {
    private List<Building> buildings = new ArrayList<>();

    public void add(Building building){
        buildings.add(building);
    }

    @Override
    public void printInfo() {
        System.out.println(Arrays.asList(buildings));
    }
}
