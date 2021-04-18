package com.demotivirus.Day_116;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Mark", "Antoni", "Paolo"};
        Name name = new Name(names);

        for (Iterator nameIterator = name.getIterator(); nameIterator.hasNext(); ){
            String iName = (String) nameIterator.next();
            System.out.println(iName);
        }
    }
}
