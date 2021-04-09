package com.demotivirus.Day_108;

import lombok.NonNull;

public class EmailNotifier extends AbstractNotifier {

    public EmailNotifier(@NonNull int priority) {
        super(priority);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email notify: " + message);
    }
}
