package com.demotivirus.Day_146;

public class Main {
    public static void main(String[] args) {
        StudentBO students = new StudentBO();

        for (StudentVO student : students.getAll()) {
            System.out.println("Name: " + student.getName() + " id: " + student.getIndexOnDb());
        }

        StudentVO studentVO = students.get(0);
        System.out.println(studentVO);
        studentVO.setName("New Student");
        students.update(studentVO);
        students.delete(studentVO);
        System.out.println();

        for (StudentVO student : students.getAll()) {
            System.out.println("Name: " + student.getName() + " id: " + student.getIndexOnDb());
        }

        System.out.println();

        UserDb userDb = new UserDb();
        User user = userDb.get(0);
        user.setCellPhone("911");
        userDb.save(user);
        userDb.update(user);
        userDb.delete(0);
    }
}
