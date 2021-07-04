package com.demotivirus.Day_187_S2.lambda_example.solutions.CodeEvolution_1;

import com.demotivirus.Day_187_S2.lambda_example.Message;

public class CheckConditionWithinCity implements CheckCondition{
    @Override
    public boolean check(Message message) {
        return "Luxembourg".equalsIgnoreCase(message.getUser().getCity());
    }
}
