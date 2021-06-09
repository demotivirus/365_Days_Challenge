package com.demotivirus.Day_163.constatnts;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum MessageConst {
    PLEASE_WAIT("PLEASE WAIT"),
    STATUS_MESSAGE("Current status is: "),
    VALIDATION_MESSAGE("VALIDATION............."),

    LISTENER_ASYNCH_END("\nASYNCHRONOUS END"),
    LISTENER_END_MESSAGE("====================="),
    LISTENER_AGD_SUCCESS("Change AGD is success"),
    LISTENER_FILE_SUCCESS("Send file is success");

    private String message;
}
