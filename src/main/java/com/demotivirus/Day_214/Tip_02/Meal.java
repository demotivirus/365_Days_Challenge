package com.demotivirus.Day_214.Tip_02;

import com.demotivirus.Day_209_211.Tip_02.Item;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Meal {
    private List<com.demotivirus.Day_209_211.Tip_02.Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
}
