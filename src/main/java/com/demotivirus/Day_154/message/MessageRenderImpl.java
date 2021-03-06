package com.demotivirus.Day_154.message;

public class MessageRenderImpl implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    @Override
    public void render() {
        if (messageProvider == null)
            messageProvider = new MessageProviderImpl();
        System.out.println(messageProvider.getMessage());
    }
}
