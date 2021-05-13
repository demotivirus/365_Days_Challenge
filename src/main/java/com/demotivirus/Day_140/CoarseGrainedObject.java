package com.demotivirus.Day_140;

import lombok.Setter;

public class CoarseGrainedObject {
    private DependentObjectOne one = new DependentObjectOne();
    private DependentObjectTwo two = new DependentObjectTwo();

    public void setData(String one, String two) {
        this.one.setData(one);
        this.two.setData(two);
    }

    public String[] getData() {
        return new String[] {one.getData(), two.getData()};
    }
}
