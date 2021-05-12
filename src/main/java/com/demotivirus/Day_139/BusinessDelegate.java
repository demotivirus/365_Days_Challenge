package com.demotivirus.Day_139;

import com.demotivirus.Day_139.business.BusinessService;
import com.demotivirus.Day_139.locator.BusinessLookUp;
import lombok.Setter;

public class BusinessDelegate {
    private BusinessLookUp businessLookUp = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public BusinessDelegate(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = businessLookUp.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
