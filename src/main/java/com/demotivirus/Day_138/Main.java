package com.demotivirus.Day_138;

public class Main {
    public static void main(String[] args) {
        Student model = StudentFromDb.getTestStudent();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Thom");
        controller.updateView();
        System.out.println(controller.toString());
    }
}
