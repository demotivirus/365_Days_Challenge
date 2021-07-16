package com.demotivirus.Day_199;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cost {
    private double money;
    private LocalTime time;
}
