package com.demotivirus.Day_101.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@AllArgsConstructor
public class Fault extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;
    private Group group;

    public Fault(String message) {
        this.message = message;
        group = Group.VALIDATION_EXCEPTION;
    }
}
