package com.demotivirus.Day_221;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class NumbersFormat {
    public static void main(String[] args) {
        System.out.println(forLocaleStyle(Locale.US, NumberFormat.Style.SHORT, 1000));
        System.out.println(forLocaleStyle(Locale.US, NumberFormat.Style.SHORT, 1_000_000));
        System.out.println(forLocaleStyle(Locale.US, NumberFormat.Style.SHORT, 1_000_000_000));

        System.out.println(forLocaleStyle(Locale.US, NumberFormat.Style.LONG, 1000));
        System.out.println(forLocaleStyle(Locale.US, NumberFormat.Style.LONG, 1_000_000));
        System.out.println(forLocaleStyle(Locale.US, NumberFormat.Style.LONG, 1_000_000_000));

        System.out.println(forLocaleStyle(Locale.ITALIAN, NumberFormat.Style.SHORT, 1000));
        System.out.println(forLocaleStyle(Locale.ITALIAN, NumberFormat.Style.SHORT, 1_000_000));
        System.out.println(forLocaleStyle(Locale.ITALIAN, NumberFormat.Style.SHORT, 1_000_000_000));

        System.out.println(forLocaleStyle(Locale.ITALIAN, NumberFormat.Style.LONG, 1000));
        System.out.println(forLocaleStyle(Locale.ITALIAN, NumberFormat.Style.LONG, 1_000_000));
        System.out.println(forLocaleStyle(Locale.ITALIAN, NumberFormat.Style.LONG, 1_000_000_000));

        System.out.println(forLocaleStyle(Locale.US, NumberFormat.Style.LONG, 1000));
        System.out.println(forLocaleStyle(Locale.US, NumberFormat.Style.LONG, 1_000_000));
        System.out.println(forLocaleStyle(Locale.US, NumberFormat.Style.LONG, 1_000_000_000));
    }

    private static String forLocale(Locale locale, double number) {
        return format(locale, NumberFormat.Style.SHORT, null, number);
    }

    private static String forLocaleStyle(Locale locale, NumberFormat.Style style, double number) {
        return format(locale, style, null, number);
    }

    private static String format(Locale locale, NumberFormat.Style style, RoundingMode roundingMode, double number) {
        if (locale == null || style == null)
            return String.valueOf(number); //default format

        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(locale, style);
        if (roundingMode != null)
            numberFormat.setRoundingMode(roundingMode);

        return numberFormat.format(number);
    }
}
