package com.demotivirus.Day_128;

public class CustomerFactory {
    private static final String[] names = {"Steve", "Lily", "Rob", "Peter", "Nana"};

    public static AbstractCustomer getCustomer(String name) {
        for (String n : names) {
            if (n.equalsIgnoreCase(name))
                return new RealCustomer(name);
        }
        return new NullCustomer();
    }
}
