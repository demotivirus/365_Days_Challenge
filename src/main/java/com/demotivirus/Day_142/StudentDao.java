package com.demotivirus.Day_142;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    void removeStudent(Student student);
    void saveStudent(Student student);
    void updateStudent(Student student, Student newStudent);
    Student getStudent(String studentName);
}
