package com.demotivirus.Day_058;

public class Main {
    public static void main(String[] args) {
        Human sam = new Human("Sam");
        Phone iPhone = new Phone("Iphone 10");
        sam.addPhone(iPhone);
        sam.write(iPhone,"Title", "Many text here");
        sam.write(iPhone,"Eat", "Buy milk in Walmart");

        /*
        it's illustrate add message on back
        Notebook notebook = new Notebook();
        iPhone.addNote("Title", "Many text here");
        notebook.addNote("Title", "Many text here");
        */

        System.out.println(sam);
    }
}
