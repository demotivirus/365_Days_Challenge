package com.demotivirus.Day_222.Tip_14;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String name;

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
