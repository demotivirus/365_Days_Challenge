package com.demotivirus.Day_052_Dictionary.model;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Person {
    @NonNull
    private Long id;
    private List<Drink> drinks;
}
