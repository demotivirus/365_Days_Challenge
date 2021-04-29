package com.demotivirus.Day_127;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static Map<Integer, Integer> price = new HashMap<>();
    private static Order order = new Order();
    private static PayStrategy payStrategy;
    private static CreditCard creditCard
            = new CreditCard(10_000, "8239 3983 9222 8402", "12/22", "911");

    static {
        price.put(1, 2200);
        price.put(2, 220);
        price.put(3, 200);
        price.put(4, 2500);
        price.put(5, 3400);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost = 0;
            String continueChoice;

            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n" +
                        "5 - IQ" + "\n");

                int choice = Integer.parseInt(br.readLine());
                cost = price.get(choice);
                System.out.println("Count: ");
                int count = Integer.parseInt(br.readLine());
                order.setTotalCost(cost * count);

                System.out.println("Do you wish continue? [Y/N]");
                continueChoice = br.readLine();
            } while (continuePay(continueChoice));

            if (payStrategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card");

                int payMethod = Integer.parseInt(br.readLine());

                if (payMethod == 1)
                    payStrategy = new PayByPayPal();
                else payStrategy = new PayByCreditCard(creditCard);
            }

            order.processOrder(payStrategy);
            System.out.println("Pay : " + order.getTotalCost() + ". Continue? [Y/N]");
            String proceed = br.readLine();

            if (continuePay(proceed)) {
                if (payStrategy.pay(order.getTotalCost())) {
                    System.out.println("Payment successful");
                    order.clearOrderCost();
                }
                else {
                    System.out.println("Not enough money");
                    order.clearOrderCost();
                }
            }
        }
    }

    private static boolean continuePay(String answer) {
        if (answer.equalsIgnoreCase("Y"))
            return true;
        else return false;
    }
}
