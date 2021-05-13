package com.demotivirus.Day_140;

public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (String data : compositeEntity.getData()) {
            System.out.println("Data: " + data);
        }
    }

    public void setData(String one, String two) {
        compositeEntity.setData(one, two);
    }
}
