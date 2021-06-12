package com.demotivirus.Day_166;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ApiGateway {
    @Resource
    private ImageMicroservice imageMicroservice;

    @Resource
    private PriceMicroservice priceMicroservice;

    @GetMapping("/desktop")
    public DesktopProduct getDesktopProduct() {
        DesktopProduct desktopProduct = new DesktopProduct();
        desktopProduct.setPath(imageMicroservice.getPath());
        desktopProduct.setPrice(priceMicroservice.getPrice());
        return desktopProduct;
    }

    @GetMapping("/mobile")
    public MobileProduct getMobileProduct() {
        MobileProduct mobileProduct = new MobileProduct();
        mobileProduct.setPrice(priceMicroservice.getPrice());
        return mobileProduct;
    }
}
