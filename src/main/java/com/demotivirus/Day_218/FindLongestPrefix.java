package com.demotivirus.Day_218;

public class FindLongestPrefix {
    private static String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdef"};

    public static void main(String[] args) {
        System.out.println(findLongestPrefix(texts));
    }

    private static String findLongestPrefix(String[] array) {
        if (array.length == 1)
            return array[0];

        int firstLength = array[0].length();
        for (int prefixLength = 0; prefixLength < firstLength; prefixLength++) {
            char ch = array[0].charAt(prefixLength);
            for (int i = 1; i < array.length; i++) {
                if (prefixLength >= array[i].length() || array[i].charAt(prefixLength) != ch)
                    return array[i].substring(0, prefixLength);
            }
        }

        return array[0];
    }
}
