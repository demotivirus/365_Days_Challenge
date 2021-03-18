package com.demotivirus.Day_087_S2.product;

import com.demotivirus.Day_087_S2.packing.Packing;

public interface Product {
    String getName();
    Packing getPacking();
    double getPrice();
}
