package com.demotivirus.Day_079;

public class UniversalAdapter implements Json, Xml {
    private Xml xml;
    private Json json;

    public UniversalAdapter(){
        this.xml = new ConcreteXml();
        this.json = new ConcreteJson();
    }

    @Override
    public void printJson(String message) {
        json.printJson(message);
    }

    @Override
    public void printXml(String message) {
        xml.printXml(message);
    }

    public void jsonToXml(String message){
        xml.printXml(message);
    }

    public void xmlToJson(String message){
        json.printJson(message);
    }
}
