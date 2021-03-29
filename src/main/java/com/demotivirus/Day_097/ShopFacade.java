package com.demotivirus.Day_097;

public class ShopFacade {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop xiaomy;

    public ShopFacade(){
        iphone = new Iphone();
        samsung = new Samsung();
        xiaomy = new Xiaomy();
    }

    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }

    public void xiaomySale(){
        xiaomy.modelNo();
        xiaomy.price();
    }
}
