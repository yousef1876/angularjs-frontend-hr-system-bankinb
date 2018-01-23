package com.framework.core.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TransactionAmountException extends RuntimeException {

    public TransactionAmountException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransactionAmountException(String message) {
        super(message);
    }

    public TransactionAmountException() {
        super("Transaction Amount Problem");
    }

    @ExceptionHandler(TransactionAmountException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.BAD_REQUEST.value());
        error.setStatusText(ex.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.add("statusText", ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, headers,HttpStatus.BAD_REQUEST);
    }
}
