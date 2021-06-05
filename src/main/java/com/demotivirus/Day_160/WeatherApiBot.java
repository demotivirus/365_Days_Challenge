package com.demotivirus.Day_160;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendVoice;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class WeatherApiBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return BotEnvironments.WEATHER_BOT_USERNAME.getText();
    }

    @Override
    public String getBotToken() {
        return BotEnvironments.WEATHER_BOT_TOKEN.getText();
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Message message = update.getMessage();
            SendMessage sendMessage = new SendMessage();

            //sendMessage.enableMarkdown(true); //for many variables answers
            sendMessage.setChatId(message.getChatId().toString());
            //sendMessage.setReplyToMessageId(message.getMessageId());
            //sendMessage.set

            switch (message.getText()) {
                case "/help" -> {
                    try {
                        sendMessage.setText(message.getText() + " how can i help you?");
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                case "/settings" -> {
                    sendMessage.setText(message.getText() + " What are we going to customize?");
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

//    private SendVoice sendMsg(Message message, String text) {
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.enableMarkdown(true); //for many variables answers
//        sendMessage.setChatId(message.getChatId().toString());
//        sendMessage.setReplyToMessageId(message.getMessageId());
//        sendMessage.setText(text);
//        try {
//            AbsSender
//        } catch () {
//
//        }
//        return null;
//    }
}
