package com.demotivirus.Day_080;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestLogic {
    public static void main(String[] args) {
        String str = "ДЕЙСТВУЕТN";

        if (!str.equalsIgnoreCase("действует") &&
                !str.equalsIgnoreCase("рассмотрение документов")){
            log.warn(str);
        }
        else log.info("OK");

        Shape triangle = new Triangle(new BlackColor());
        triangle.draw();
    }
}
