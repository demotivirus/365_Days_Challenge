package com.demotivirus.Day_110;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(buyStock);
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
        broker.placeOrders();
        broker.placeOrders();
    }
}
