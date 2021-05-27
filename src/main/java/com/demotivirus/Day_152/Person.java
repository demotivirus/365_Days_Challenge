package com.demotivirus.Day_152;

import com.demotivirus.Day_152.constants.Gender;
import com.demotivirus.Day_152.constants.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Person {
    private String name;
    private Gender gender;
    private MaritalStatus maritalStatus;
}
