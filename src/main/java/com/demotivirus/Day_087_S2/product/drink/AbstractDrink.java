package com.demotivirus.Day_087_S2.product.drink;

import com.demotivirus.Day_087_S2.packing.Packing;
import com.demotivirus.Day_087_S2.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public abstract class AbstractDrink implements Product {
    protected Packing packing;
    protected String name;
    protected double price;

    public AbstractDrink(@NonNull Packing packing) {
        this.packing = packing;
    }

    @Override
    public String toString() {
        return "AbstractDrink{" +
                "packing=" + packing +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
