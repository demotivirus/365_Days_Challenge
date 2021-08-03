package com.demotivirus.Day_216;

public class GeneratePermutation {
    public static void main(String[] args) {
        String text = "ABCD";
        permuteAndPrint(text);
    }

    private static void permuteAndPrint(String str) {
        permuteAndPrint("", str);
    }

    private static void permuteAndPrint(String prefix, String str) {
        int n = str.length();

        if (n == 0) {
            System.out.print(prefix + " ");
        }
        else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }
}
