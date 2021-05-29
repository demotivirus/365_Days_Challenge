package com.demotivirus.Day_154_S2;

public interface MessageRenderer {
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
    void render();
}
