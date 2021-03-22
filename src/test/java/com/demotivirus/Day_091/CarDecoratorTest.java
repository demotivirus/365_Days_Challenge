package com.demotivirus.Day_091;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarDecoratorTest {
    @Test
    public void simpleTest(){
        Car sportCar = new SportCar(new BasicCar());
        String answer1 = "Sport car with Basic car";
        Assertions.assertEquals(answer1, sportCar.assemble());

        Car decoratorCar = new SportCar(new LuxuryCar(new BasicCar()));
        String answer2 = "Sport car with Luxury car with Basic car";
        Assertions.assertEquals(answer2, decoratorCar.assemble());
    }
}
