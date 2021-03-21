package com.demotivirus.Day_090;

import lombok.NonNull;


public class Garland extends TreeDecorator{
    public Garland(@NonNull Tree tree) {
        super(tree);
    }

    @Override
    public void decorate() {
        super.decorate();
        System.out.println("With garland");
    }
}
