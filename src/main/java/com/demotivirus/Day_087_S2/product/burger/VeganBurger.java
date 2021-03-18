package com.demotivirus.Day_087_S2.product.burger;

import com.demotivirus.Day_087_S2.packing.Packing;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class VeganBurger extends AbstractBurger{
    public VeganBurger(Packing packing) {
        super(packing);
    }

    public VeganBurger(Packing packing, String name, double price) {
        super(packing, name, price);
    }

    @Override
    public String toString() {
        return "VeganBurger{" +
                "packing=" + packing +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
