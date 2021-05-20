package com.demotivirus.Day_146;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    private List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<>();
        StudentVO student1 = new StudentVO("Robert", 0);
        StudentVO student2 = new StudentVO("Mike", 1);
        students.add(student1);
        students.add(student2);
    }

    public void delete(StudentVO student) {
        students.remove(student);
        System.out.println(student + " was deleted");
    }

    public List<StudentVO> getAll() {
        return students;
    }

    public StudentVO get(int indexOnDb) {
        return students.get(indexOnDb);
    }

    public void update(StudentVO student) {
        students.get(student.getIndexOnDb()).setName(student.getName());
        System.out.println("Student id: " + student.getIndexOnDb() + " was updated");
    }
}
