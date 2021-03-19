package com.demotivirus.Day_088;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public abstract class AbstractBuilding implements Building {
    private List<Human> humans = new ArrayList<>();

    public void addHuman(Human human){
        humans.add(human);
    }

    @Override
    public void printInfo() {
        for (Human h : humans){
            System.out.println(h);
        }
    }
}
