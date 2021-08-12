package com.demotivirus.Day_224;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConstructorCloning {
    private double x;
    private double y;

    //cloning constructor
    public ConstructorCloning(ConstructorCloning constructorCloning) {
        this.x = constructorCloning.x;
        this.y = constructorCloning.y;
    }
}
