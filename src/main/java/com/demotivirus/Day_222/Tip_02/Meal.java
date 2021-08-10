package com.demotivirus.Day_222.Tip_02;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
}
