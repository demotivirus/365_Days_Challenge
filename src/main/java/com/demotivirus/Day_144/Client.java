package com.demotivirus.Day_144;

import lombok.Setter;

public class Client {
    @Setter
    FilterManager filterManager;

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
