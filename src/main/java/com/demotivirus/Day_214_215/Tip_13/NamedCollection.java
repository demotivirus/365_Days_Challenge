package com.demotivirus.Day_214_215.Tip_13;

import lombok.ToString;

@ToString
public class NamedCollection implements Container{
    private String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return names[index++];
            return null;
        }
    }
}
