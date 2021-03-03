package com.demotivirus.Day_072;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @RequiredArgsConstructor
public class Coffee implements Drink {
    @NonNull
    private String nameOfDrink;

    @Override
    public Drink cup() {
        return new Coffee(nameOfDrink);
    }
}
