package com.demotivirus.Day_091;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarDecorator implements Car {
    @NonNull
    protected Car car;

    @Override
    public String assemble() {
        return car.assemble();
    }
}
