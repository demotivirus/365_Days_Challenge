package com.demotivirus.Day_139.locator;

import com.demotivirus.Day_139.business.BusinessService;
import com.demotivirus.Day_139.business.EjbService;
import com.demotivirus.Day_139.business.JmsService;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB"))
            return new EjbService();
        else return new JmsService();
    }
}
