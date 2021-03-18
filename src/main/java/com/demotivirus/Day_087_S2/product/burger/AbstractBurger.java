package com.demotivirus.Day_087_S2.product.burger;

import com.demotivirus.Day_087_S2.packing.Packing;
import com.demotivirus.Day_087_S2.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractBurger implements Product {
    protected Packing packing;
    protected String name;
    protected double price;

    public AbstractBurger(Packing packing) {
        this.packing = packing;
    }

    @Override
    public String toString() {
        return "AbstractBurger{" +
                "packing=" + packing +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
