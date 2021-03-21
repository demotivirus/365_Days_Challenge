package com.demotivirus.Day_090;

import lombok.NonNull;

public class BubbleLights extends TreeDecorator {
    public BubbleLights(@NonNull Tree tree) {
        super(tree);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("With bubble lights");
    }
}
