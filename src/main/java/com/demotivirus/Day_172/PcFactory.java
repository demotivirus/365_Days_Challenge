package com.demotivirus.Day_172;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PcFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public Computer create() {
        return new PC(ram, hdd, cpu);
    }
}
