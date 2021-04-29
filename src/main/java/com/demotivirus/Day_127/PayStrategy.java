package com.demotivirus.Day_127;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
