package com.demotivirus.Day_163.constatnts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @AllArgsConstructor
public enum StatusConst {
    INIT(0),
    START(100),
    CHANGING_AGD(101),
    CHANGE_AGD(200),
    SENDING_FILE(201),
    SEND_FILE(300);

    private int status;
}
