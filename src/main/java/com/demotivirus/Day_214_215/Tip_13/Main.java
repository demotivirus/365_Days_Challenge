package com.demotivirus.Day_214_215.Tip_13;

public class Main {
    public static void main(String[] args) {
        NamedCollection namedCollection = new NamedCollection();
        for(Iterator iter = namedCollection.getIterator(); iter.hasNext(); ){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
