package com.demotivirus.Day_216;

public class IsPalindrome {
    public static void main(String[] args) {
        String TEXT = "ABCDEFEDCBA";

        System.out.println(isPalindrome(TEXT));
        System.out.println(isPalindromeToo(TEXT));
    }

    private static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (right > left) {
            if (text.charAt(left) != text.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindromeToo(String text) {
        int n = text.length();

        for (int i = 0; i < n / 2; i++) {
            if (text.charAt(i) != text.charAt(n - i - 1))
                return false;
        }
        return true;
    }
}
