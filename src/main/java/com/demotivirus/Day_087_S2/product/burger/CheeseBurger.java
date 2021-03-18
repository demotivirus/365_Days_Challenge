package com.demotivirus.Day_087_S2.product.burger;

import com.demotivirus.Day_087_S2.packing.Packing;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CheeseBurger extends AbstractBurger {
    public CheeseBurger(Packing packing) {
        super(packing);
    }

    public CheeseBurger(Packing packing, String name, double price) {
        super(packing, name, price);
    }

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "packing=" + packing +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
