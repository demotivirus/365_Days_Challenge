package com.demotivirus.Day_187_S2.lambda_example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
@AllArgsConstructor
public class User {
	private int id;
	private String name;
	private String city;
	private int age;
	private Sex sex;
}
