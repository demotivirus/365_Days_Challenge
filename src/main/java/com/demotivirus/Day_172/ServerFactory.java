package com.demotivirus.Day_172;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public Computer create() {
        return new Server(ram, hdd, cpu);
    }
}
