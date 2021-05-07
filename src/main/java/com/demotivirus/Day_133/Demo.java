package com.demotivirus.Day_133;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Demo {
    public int publicField;
    private String value = "initValue";

    private void secretMethod() {
        System.out.println("This is secret method");
    }

    @Override
    @Deprecated
    public String toString() {
        return "Demo{" +
                "publicField=" + publicField +
                ", value='" + value + '\'' +
                '}';
    }
}
