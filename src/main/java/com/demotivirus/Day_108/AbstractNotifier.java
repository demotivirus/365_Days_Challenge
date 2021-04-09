package com.demotivirus.Day_108;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public abstract class AbstractNotifier {
    @NonNull
    private int priority;

    private AbstractNotifier nextNotifier;

    public void manager(String message, int level) {
        if (level >= priority)
            sendMessage(message);
        if (nextNotifier != null)
            nextNotifier.manager(message, level);
    }

    public abstract void sendMessage(String message);
}
