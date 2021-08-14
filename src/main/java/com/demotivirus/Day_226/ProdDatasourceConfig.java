package com.demotivirus.Day_226;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class ProdDatasourceConfig implements DatasourceConfig {
    @Override
    public void setup() {
        System.err.println("Settings for prod datasource connect");
    }
}
