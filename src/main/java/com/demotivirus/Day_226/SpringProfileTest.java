package com.demotivirus.Day_226;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.env.Environment;

@Component
public class SpringProfileTest {
    @Autowired
    private Environment environment;

    public void getActiveProfiles() {
        for (final String profileName : environment.getActiveProfiles()) {
            System.out.println("Currently active profile - " + profileName);
        }
    }
}
