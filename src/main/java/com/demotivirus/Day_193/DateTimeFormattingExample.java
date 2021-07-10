package com.demotivirus.Day_193;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormattingExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2015, 12, 25, 17, 28, 30);
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/mm/dd")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yy/mm/dd")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy.mm.dd hh:mm")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.JAPANESE)));
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK)));
        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.US)));
    }
}
