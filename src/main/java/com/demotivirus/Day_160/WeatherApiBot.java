package com.demotivirus.Day_160;

import com.demotivirus.Day_160.weather_api.WeatherParser;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
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

            sendMessage.enableMarkdown(true); //for many variables answers
            sendMessage.setChatId(message.getChatId().toString());
            sendMessage.setReplyToMessageId(message.getMessageId());

            if (!message.getText().startsWith("/")) {
                if (message.getText().matches("[а-яёА-ЯЁ]*"))
                    sendMessage.setText("Тумпература в городе " + message.getText()
                            + " " + WeatherParser.getCelsiusTemp(message.getText())
                            + " градусов");
                else sendMessage.setText("Temperature in " + message.getText() +
                        " is " + WeatherParser.getCelsiusTemp(message.getText())
                        + " C");
            } else {
                switch (message.getText()) {
                    case "/start" -> sendMessage.setText("My commands: /температура /weather /help /settings");
                    case "/help" -> sendMessage.setText(message.getText() + " how can i help you?");
                    case "/settings" -> sendMessage.setText(message.getText() + " What are we going to customize?");
                    case "/weather" -> sendMessage.setText("Enter the city");
                    case "/температура", "температура" -> sendMessage.setText("Введите город");
                    default -> sendMessage.setText(message.getText() + " i'm just a bot. I don't understand human language :(");
                }
            }

            start(sendMessage);
        }
    }

    private void start(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
