package com.demotivirus.Day_084;

import lombok.NonNull;
import lombok.ToString;

@ToString
public class Dot extends BaseShape {
    public Dot(@NonNull int x, @NonNull int y, @NonNull Color color) {
        super(x, y, color);
    }
}
