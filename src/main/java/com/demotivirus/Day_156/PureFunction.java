package com.demotivirus.Day_156;

public class PureFunction {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println(sum(5, 8));
    }

    //this is pure function
    //is not modified var & references

    private static int sum(int x, int y) {
        return x + y;
    }
}
