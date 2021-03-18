package com.demotivirus.Day_087_S2.product.drink;

import com.demotivirus.Day_087_S2.packing.Packing;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
public class CocaCola extends AbstractDrink {
    public CocaCola(@NonNull Packing packing) {
        super(packing);
    }

    public CocaCola(@NonNull Packing packing, @NonNull String name, @NonNull double price) {
        super(packing, name, price);
    }

    @Override
    public String toString() {
        return "CocaCola{" +
                "packing=" + packing +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
