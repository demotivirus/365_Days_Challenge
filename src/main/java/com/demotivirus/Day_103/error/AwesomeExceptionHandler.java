package com.demotivirus.Day_103.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AwesomeExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(MainException.class)
    protected ResponseEntity<AwesomeException> handleNoUserException(){
        return new ResponseEntity<>(new AwesomeException("User not found"), HttpStatus.NOT_FOUND);
    }
}
