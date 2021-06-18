package com.demotivirus.Day_172;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.create(new PcFactory("4 GB", "500 GB", "2.4 GHz"));
        pc.printInfo();

        Computer server = ComputerFactory.create(new ServerFactory("32 GB", "8 TB", "4.0 GHz"));
        server.printInfo();
    }
}
