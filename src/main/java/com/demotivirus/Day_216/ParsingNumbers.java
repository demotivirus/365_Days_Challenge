package com.demotivirus.Day_216;

public class ParsingNumbers {
    public static void main(String[] args) {
        String TO_INT = "453";
        String TO_LONG = "45234223233";
        String TO_FLOAT = "45.823F";
        String TO_DOUBLE = "13.83423d";

        int tolnt = Integer.parseInt(TO_INT);
        long toLong = Long.parseLong(TO_LONG);
        float toFloat = Float.parseFloat(TO_FLOAT);
        double toDouble = Double.parseDouble(TO_DOUBLE);

        Integer tolnt2 = Integer.valueOf(TO_INT);
        Long toLong2 = Long.valueOf(TO_LONG);
        Float toFloat2 = Float.valueOf(TO_FLOAT);
        Double toDouble2 = Double.valueOf(TO_DOUBLE);
    }
}
