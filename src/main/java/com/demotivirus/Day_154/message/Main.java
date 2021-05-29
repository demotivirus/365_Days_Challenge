package com.demotivirus.Day_154.message;

public class Main {
    public static void main(String[] args) {
        MessageProvider provider = MessageFactory.getInstance().getProvider();
        MessageRenderer renderer = MessageFactory.getInstance().getRenderer();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
