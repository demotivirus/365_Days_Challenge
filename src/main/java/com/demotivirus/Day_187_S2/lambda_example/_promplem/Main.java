package com.demotivirus.Day_187_S2.lambda_example._promplem;

import com.demotivirus.Day_187_S2.lambda_example.Message;
import com.demotivirus.Day_187_S2.lambda_example.Sex;
import com.demotivirus.Day_187_S2.lambda_example.User;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Herman", "Frankfurt", 22, Sex.MALE);
        User user2 = new User(2, "Marianna", "Luxembourg", 24, Sex.FEMALE);

        Timestamp currentTime = new Timestamp(System.currentTimeMillis() - 10);

        List<Message> messages = new ArrayList<>();
        messages.add(new Message(1, 123, user1, new Timestamp(System.currentTimeMillis()), "You look a great!"));
        messages.add(new Message(2, 123, user2, new Timestamp(System.currentTimeMillis()), "Hello. Thank you)"));


        printMessagesAfterTime(messages, currentTime);
        printMessagesWithRange(messages, currentTime, new Timestamp(System.currentTimeMillis() + 10));
        printMessagesWithinChat(messages, 123);
        printMessagesWithinCity(messages, "Frankfurt");
    }

    private static void printMessagesAfterTime(List<Message> messages, Timestamp from) {
        for (Message message : messages) {
            if (from.before(message.getTimestamp()))
                System.out.println("Message send after enter time: " + message);
        }
        printSplit();
    }

    private static void printMessagesWithRange(List<Message> messages, Timestamp from, Timestamp to) {
        for (Message message : messages) {
            Timestamp time = message.getTimestamp(); //get time from message
            if (from.before(time) && time.before(to))
                System.out.println("Found message in this time period: " + message);
        }
        printSplit();
    }

    private static void printMessagesWithinChat(List<Message> messages, long chatId) {
        for (Message message : messages) {
            if (message.getChatId() == chatId)
                System.out.println("Found message in chat " + chatId + ": " + message);
        }
        printSplit();
    }

    private static void printMessagesWithinCity(List<Message> messages, String city) {
        for (Message message : messages) {
            if (city.equalsIgnoreCase(message.getUser().getCity()))
                System.out.println("Found message from city " + city + ": " + message);
        }
        printSplit();
    }

    private static void printSplit() {
        System.out.println("====================================");
    }
}
