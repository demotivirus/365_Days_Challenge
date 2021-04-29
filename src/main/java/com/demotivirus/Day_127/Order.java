package com.demotivirus.Day_127;

public class Order {
    private int totalCost = 0;
    private boolean isClosed;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }

    public void clearOrderCost() {
        totalCost = 0;
    }
}
