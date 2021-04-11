package com.demotivirus.Day_110;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        if (orders.isEmpty())
            System.out.println("Orders is empty");
        for (Order o : orders)
            o.execute();
        orders.clear();
    }
}
