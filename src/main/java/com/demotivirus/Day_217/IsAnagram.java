package com.demotivirus.Day_217;

public class IsAnagram {
    public static void main(String[] args) {
        String first = "hello world";
        String second = "dhle rlo l wo";

        System.out.println(isAnagram(first, second));
    }

    private static boolean isAnagram(String first, String second) {
        int[] asciiChars = new int[256];
        char[] firsChars = first.replaceAll(" ", "").toLowerCase().toCharArray(); //remove all whitespaces
        char[] secondChars = second.replaceAll(" ", "").toLowerCase().toCharArray(); //remove all whitespaces

        if (firsChars.length != secondChars.length)
            return false;

        for (int i = 0; i < firsChars.length; i++) {
            asciiChars[firsChars[i]]++;
            asciiChars[secondChars[i]]--;
        }

        for (int ascii : asciiChars) {
            if (ascii != 0)
                return false;
        }

        return true;
    }
}
