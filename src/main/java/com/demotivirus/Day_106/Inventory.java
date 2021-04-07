package com.demotivirus.Day_106;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Inventory {
    //private List<Inventoreable> inventoreables = new ArrayList<>();
    private Inventoreable[][] inventoreables = new Inventoreable[20][0];


    public void addInventory(Inventoreable inventoreable){
   //     inventoreables.add(inventoreable);
        Inventoreable[] blocks = new Inventoreable[20];
        for (int i = 0; i < inventoreables.length; i++) {
            inventoreables[i] = blocks; //set all nested array to size 20
        }

        for (int i = 0; i < inventoreables.length; i++) {
            if (inventoreables[i] != null){
                for (int j = 0; j < blocks.length; j++) {
                    if (inventoreables[i][j] == null){
                        inventoreables[i][j] = inventoreable;
                        return;
                    }
                }
                break;
            }

        }
        //inventoreables[0][0] = inventoreable;
    }
}
