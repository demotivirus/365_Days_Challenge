package com.demotivirus.Day_106;

import lombok.Data;
import lombok.ToString;

@ToString
public class Human {
    private Inventory inventory;

    public void addInventory(Inventoreable inventoreable){
        if (inventory == null) inventory = new Inventory();
        inventory.addInventory(inventoreable);
    }
}
