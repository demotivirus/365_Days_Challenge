package com.demotivirus.Day_072;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data @RequiredArgsConstructor
public class DefaultCash implements Cash{
    @NonNull
    private double dollar;

    @Override
    public Cash multiply(double factor) {
        return new DefaultCash(dollar * factor);
    }
}
