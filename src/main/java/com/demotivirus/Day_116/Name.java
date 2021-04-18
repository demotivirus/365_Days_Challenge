package com.demotivirus.Day_116;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Name implements Container {
    private String[] names;

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            if (index < names.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return names[index++];
            return null;
        }
    }
}
