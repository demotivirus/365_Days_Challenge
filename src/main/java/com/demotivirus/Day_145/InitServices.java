package com.demotivirus.Day_145;

public class InitServices {
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE 1")) {
            System.out.println("Looking and creating new Service 1 object");
            return new Service1();
        }
        else if (jndiName.equalsIgnoreCase("SERVICE 2")) {
            System.out.println("Looking and creating new Service 2 object");
            return new Service2();
        }

        return new Object();
    }
}
