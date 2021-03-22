package com.demotivirus.Day_091;

import lombok.NonNull;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(@NonNull Car car) {
        super(car);
    }

    @Override
    public String assemble(){
        return "Luxury car with " + car.assemble();
    }
}