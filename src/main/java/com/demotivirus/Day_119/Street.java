package com.demotivirus.Day_119;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Street {
    private List<Building> buildings = new ArrayList<>();

    public void addBuilding(Building building){
        buildings.add(building);
    }
}
