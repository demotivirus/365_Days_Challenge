package com.demotivirus.Day_142;

import java.util.ArrayList;
import java.util.List;

public class StudentFromDb {
    public static List<Student> getTestData() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mark", 5));
        students.add(new Student("Thomas", 16));
        students.add(new Student("Dummy", 1));
        return students;
    }
}
