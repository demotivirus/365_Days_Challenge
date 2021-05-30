package com.demotivirus.Day_155;

public class FirstClassFunction {
    private static int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        SquareMaker squareMaker = item -> item * item;
        iterate(squareMaker);

        PlusInterface plusInterface = num -> num + num;
        iterate(plusInterface);

        MinusFunction minusFunction = f -> -f;
        iterate(minusFunction);
    }

    private static void iterate(OneIntArgument argument) {
        for (int a : array) {
            System.out.println(argument.argument(a));
        }
        System.out.println("========================");
    }
}
