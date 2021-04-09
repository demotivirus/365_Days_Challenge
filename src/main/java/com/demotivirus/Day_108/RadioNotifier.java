package com.demotivirus.Day_108;

import lombok.NonNull;

public class RadioNotifier extends AbstractNotifier {
    public RadioNotifier(@NonNull int priority) {
        super(priority);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Send extra secret radio notify: " + message);
    }
}
