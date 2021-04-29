package com.demotivirus.Day_127;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RequiredArgsConstructor
public class PayByCreditCard implements PayStrategy {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    @NonNull
    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails() {
        System.out.println("Enter the card number: ");

        String number = null;
        String date = null;
        String cvv = null;
        try {
            number = br.readLine();
            System.out.println("Enter card date mm/yy: ");
            date = br.readLine();
            System.out.println("Enter the CVV code: ");
            cvv = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //creditCard = new CreditCard(1000, number, date, cvv);
    }

    @Override

    public boolean pay(int paymentAmount) {
        if (cardIsPresent() && creditCard.getAmount() > paymentAmount) {
            int totalBalance = creditCard.getAmount();
            System.out.println("Payment " + paymentAmount + "$ with credit card amount: " + totalBalance);
            totalBalance -= paymentAmount;
            creditCard.setAmount(totalBalance);
            System.out.println("Total balance is: " + totalBalance);
            return true;
        } else return false;
    }

    private boolean cardIsPresent(){
        return creditCard != null;
    }
}
