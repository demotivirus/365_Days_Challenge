package com.demotivirus.Day_127;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//LOL infinity balance on payPal
//it's not a bug - it's feature
public class PayByPayPal implements PayStrategy {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private String password;
    private String email;
    private boolean isSignedIn;

    static {
        DATA_BASE.put("myNameQwErTy", "email@gmail.com");
        DATA_BASE.put("Amanda665", "dontspamthis@gmail.com");
        DATA_BASE.put("admin", "admin");
    }

    @Override
    public void collectPaymentDetails() {
        while (!isSignedIn) {
            System.out.println("Enter email: ");
            try {
                email = br.readLine();
                System.out.println("Enter password: ");
                password = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (verify())
                System.out.println("Data verification is success");
            else System.out.println("Wrong email or password");
        }
    }

    private boolean verify() {
        isSignedIn = email.equals(DATA_BASE.get(password));
        return isSignedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (isSignedIn) {
            System.out.println("User " + email + " pay amount: " + paymentAmount);
            return true;
        } else return false;
    }
}
