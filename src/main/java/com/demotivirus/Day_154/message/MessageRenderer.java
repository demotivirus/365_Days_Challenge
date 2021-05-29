package com.demotivirus.Day_154.message;

public interface MessageRenderer {
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
    void render();
}
