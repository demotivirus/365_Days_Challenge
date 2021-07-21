package com.demotivirus.Day_204;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {
    private String name;
    private boolean vegan;
    private int calories;
    private TYPE type;
}
