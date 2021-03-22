package com.demotivirus.Day_091;

public class SportCar extends CarDecorator {
    public SportCar(Car car){
        super(car);
    }

    @Override
    public String assemble(){
        return "Sport car with " + car.assemble();
    }
}
