package com.demotivirus.Day_083;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Machine implements Box{
    private List<Box> boxes = new ArrayList<>();

    @Override
    public void printNumOfThings() {
        int count = 0;
        for (Box box : boxes)
            count++;
        System.out.println(count + " boxes in machine");
    }

    public void add(Box box){
        boxes.add(box);
    }

    public void remove(Box box){
        boxes.remove(box);
    }
}
