package com.demotivirus.Day_143;

public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }

    public void getRequest(String request) {
        if (request.equalsIgnoreCase("STUDENT"))
            studentView.show();
        else homeView.show();
    }
}
