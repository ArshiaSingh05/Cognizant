package com.cognizant.springlearn.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorResponse> handleNumberFormatException(
            MethodArgumentTypeMismatchException ex) {

        ErrorResponse error =
                new ErrorResponse("Employee ID should be a valid number.");

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}