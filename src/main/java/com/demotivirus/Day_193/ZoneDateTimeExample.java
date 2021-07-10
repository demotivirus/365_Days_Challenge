package com.demotivirus.Day_193;

import java.time.*;
import java.util.Set;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        Set<String> allTimeZones = ZoneId.getAvailableZoneIds();
        System.out.println(allTimeZones);

        ZonedDateTime parseZoneDateTime = ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
        System.out.println(parseZoneDateTime);

        ZoneOffset zoneOffsetUTC = ZoneOffset.UTC;
        System.out.println(zoneOffsetUTC);

        ZoneOffset zoneOffset = ZoneOffset.of("+02:00");
        System.out.println(zoneOffset);

        System.out.println(LocalDateTime.now());
        OffsetDateTime offset = OffsetDateTime.of(LocalDateTime.now(), zoneOffset);
        System.out.println(offset);
    }
}
