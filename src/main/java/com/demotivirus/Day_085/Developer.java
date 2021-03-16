package com.demotivirus.Day_085;

import lombok.NonNull;

public class Developer extends AbstractEmployee implements Employee{
    public Developer(@NonNull long id, @NonNull String name, @NonNull String position) {
        super(id, name, position);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
