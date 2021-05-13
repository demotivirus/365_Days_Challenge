package com.demotivirus.Day_140;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test 1", "Data 1");
        client.printData();

        client.setData("Test 2", "Dota 2");
        client.printData();
    }
}
