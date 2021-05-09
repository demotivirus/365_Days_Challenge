package com.demotivirus.Day_136;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Money {
    private int value;

    public void divisionMoney(int value) {
        this.value -= value;
    }
}
