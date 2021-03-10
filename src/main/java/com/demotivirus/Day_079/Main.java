package com.demotivirus.Day_079;

public class Main {
    public static void main(String[] args) {
        Json json = new ConcreteJson();
        json.printJson("Test message");

        Xml xml = new ConcreteXml();
        xml.printXml("Test message");

        UniversalAdapter universalAdapter = new UniversalAdapter();
        universalAdapter.printJson("Hello");
        universalAdapter.printXml("Hello");

        universalAdapter.jsonToXml("{message: \"Test message\"}");
        universalAdapter.xmlToJson("<message>Test message</message>");
    }
}
