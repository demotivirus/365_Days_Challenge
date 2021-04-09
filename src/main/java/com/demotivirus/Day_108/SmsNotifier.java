package com.demotivirus.Day_108;

import lombok.NonNull;

public class SmsNotifier extends AbstractNotifier {
    public SmsNotifier(@NonNull int priority) {
        super(priority);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Send sms notify: " + message);
    }
}
