package com.demotivirus.Day_057;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Forest {
    private List<Tree> trees;

    public void addTree(Tree tree){
        if (trees == null)
            trees = new ArrayList<>();
        trees.add(tree);
    }
}
