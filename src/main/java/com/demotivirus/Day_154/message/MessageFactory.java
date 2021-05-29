package com.demotivirus.Day_154.message;

import lombok.Getter;

import java.util.Properties;

public class MessageFactory {
    @Getter
    private static MessageFactory instance = new MessageFactory();

    private Properties properties;

    @Getter
    private MessageRenderer renderer;

    @Getter
    private MessageProvider provider;

    public MessageFactory() {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/helloWorld.properties"));

            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            provider = (MessageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
