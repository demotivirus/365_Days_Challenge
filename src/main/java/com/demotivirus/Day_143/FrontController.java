package com.demotivirus.Day_143;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    public void getRequest(String request) {
        trackRequest(request); //LOGGING

        if (isAuth())
            dispatcher.getRequest(request);
    }

    private boolean isAuth() {
        System.out.println("User is auth success");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Page request: " + request);
    }
}
