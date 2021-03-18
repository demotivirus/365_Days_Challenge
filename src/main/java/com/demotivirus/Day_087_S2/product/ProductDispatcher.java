package com.demotivirus.Day_087_S2.product;

import com.demotivirus.Day_087_S2.packing.Packing;
import com.demotivirus.Day_087_S2.product.burger.CheeseBurger;
import com.demotivirus.Day_087_S2.product.burger.VeganBurger;
import com.demotivirus.Day_087_S2.product.drink.CocaCola;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class ProductDispatcher {
    private static List<Product> products = new ArrayList<>();

    private ProductDispatcher() {
    }

    public static Product getProduct(String productName) {
        if (products.isEmpty())
            feelingProducts();

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)){
                return p;
            }
        }
        return null;
    }

    private static void feelingProducts() {
        VeganBurger veganBurger = new VeganBurger(Packing.BOX, "Vegan Burger", 0.76);
        products.add(veganBurger);
        CheeseBurger cheeseBurger = new CheeseBurger(Packing.WRAPPER, "Cheese burger", 0.33);
        products.add(cheeseBurger);
        CocaCola cocaCola = new CocaCola(Packing.BOTTLE, "CocaCola", 0.55);
        products.add(cocaCola);
    }
}
