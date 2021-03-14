package com.demotivirus.Day_083;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class MediumBox implements Box{
    private List<String> things = new ArrayList<>();

    @Override
    public void printNumOfThings() {
        System.out.println(things.size());
    }

    public void add(String thingName){
        things.add(thingName);
    }
}
