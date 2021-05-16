package com.demotivirus.Day_142;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private List<Student> students = StudentFromDb.getTestData();
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public void saveStudent(Student student) {
        students.add(student);
    }

    @Override
    public void updateStudent(Student student, Student newStudent) {
        for (Student s : students) {
            if (s.equals(student)) {
                s.setName(newStudent.getName());
                s.setRoleNo(newStudent.getRoleNo());
            }
        }
    }

    @Override
    public Student getStudent(String studentName) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(studentName))
                return s;
        }
        return new Student();
    }
}
