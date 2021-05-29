package com.demotivirus.Day_154.message;

import java.io.IOException;
import java.util.Properties;

public class MessageProviderImpl implements MessageProvider {
    private Properties properties;

    @Override
    public String getMessage() {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/helloWorld.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("message.helloWorld");
    }
}
