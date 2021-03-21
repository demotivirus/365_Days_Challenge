package com.demotivirus.Day_090;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public abstract class TreeDecorator implements Tree {
    @NonNull
    private Tree tree;

    @Override
    public void decorate() {
        tree.decorate();
    }
}
