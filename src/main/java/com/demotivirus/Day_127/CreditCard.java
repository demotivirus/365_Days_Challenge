package com.demotivirus.Day_127;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
public class CreditCard {
    @Setter @Getter
    private int amount;
    private String number;
    private String date;
    private String cvv;
}
