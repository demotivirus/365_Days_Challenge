package com.demotivirus.Day_138;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
public class StudentController {
    private Student model;
    private StudentView view;

    public void setStudentName(String studentName) {
        model.setName(studentName);
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentName() {
        return model.getName();
    }

    public String getRollNo() {
        return model.getRollNo();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "model=" + model +
                '}';
    }
}
