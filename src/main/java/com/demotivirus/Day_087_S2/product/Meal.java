package com.demotivirus.Day_087_S2.product;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Meal {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public double totalCost(){
        double cost = 0.0d;
        for (Product p : products){
            cost += p.getPrice();
        }
        return cost;
    }

    public void print(){
        Double cost = 0.0d;
        for (Product p : products){
            System.out.print(p.getName() + ", ");
            cost += p.getPrice();
        }
        System.out.println();
        String round = cost.toString();
        System.out.println(round.substring(0, 4));
    }
}
