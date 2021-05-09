package com.demotivirus.Day_136;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Money {
    private Integer value;

    public Money() {
        value = 0;
    }

    public void divisionMoney(int value) {
        this.value -= value;
    }

    public void addMoney(int value) {
        this.value += value;
    }

    public boolean isNotNull() {
        return value != null ? true : false;
    }
}
