package com.demotivirus.Day_085_;

import lombok.NonNull;

public class Manager extends AbstractEmployee implements Employee {
    public Manager(@NonNull long id, @NonNull String name, @NonNull String position) {
        super(id, name, position);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
