package com.demotivirus.Day_228_229.Tip_14;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date() + " " + user.getName() + ": " + message);
    }
}
