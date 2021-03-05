package com.demotivirus.Day_074;

public interface Exchange {
    float rate(String source, String target);

    final class Smart {
        private Exchange origin;
        public float toUsd(String source){
            return origin.rate(source, "USD");
        }

        public float euroToUsd(){
            return toUsd("EUR");
        }
    }
}
