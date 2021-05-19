package com.demotivirus.Day_145;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public void addService(Service newService) {
        boolean isExists = false;

        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName()))
                isExists = true;
        }

        if (!isExists)
            services.add(newService);
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Return " + serviceName + " from cache");
                return service;
            }
        }
        return null;
    }
}
