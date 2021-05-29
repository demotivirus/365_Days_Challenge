package com.demotivirus.Day_154_S2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public MessageProvider provider() {
        return new MessageProviderImpl();
    }

    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new MessageRendererImpl();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
