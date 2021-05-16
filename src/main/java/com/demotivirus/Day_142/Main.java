package com.demotivirus.Day_142;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        System.out.println(Arrays.asList(studentDao.getAllStudents()));

        Student student = studentDao.getStudent("Mark");
        studentDao.updateStudent(student, new Student("Robbin", 26));
        System.out.println(Arrays.asList(studentDao.getAllStudents()));
    }
}
