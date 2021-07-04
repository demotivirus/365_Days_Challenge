package com.demotivirus.Day_187_S2.lambda_example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter @ToString
@AllArgsConstructor
public class Message {
	private long id;
	private long chatId;
	private User user;
	private Timestamp timestamp;
	private String text;

	private int compareBodyTimestamp(Message first, Message second){
		return first.getTimestamp().compareTo(second.getTimestamp());
	}
}
