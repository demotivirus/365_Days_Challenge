package com.demotivirus.Day_140;

import lombok.Setter;

@Setter
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String one, String two) {
        cgo.setData(one, two);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
