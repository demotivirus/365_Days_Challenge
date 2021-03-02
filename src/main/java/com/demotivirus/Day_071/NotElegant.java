package com.demotivirus.Day_071;

import lombok.Data;

@Data
public class NotElegant {
    private UUID uuid;

    public NotElegant(String firstName, String middleName, String lastName){
        uuid = new UUID();
        uuid.setFirstName(firstName);
        uuid.setMiddleName(middleName);
        uuid.setLastName(lastName);
    }
}
