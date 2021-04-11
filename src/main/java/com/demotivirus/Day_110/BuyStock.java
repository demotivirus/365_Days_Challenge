package com.demotivirus.Day_110;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuyStock implements Order {
    @NonNull
    private Stock stock;

    @Override
    public void execute() {
        stock.buy();
    }
}
