package com.demotivirus.Day_232;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Melon implements Comparable{
    private Type type;
    private int weight;

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.weight, ((Melon) o).weight);
    }
}
