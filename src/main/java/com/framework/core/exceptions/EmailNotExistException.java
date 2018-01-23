package com.framework.core.exceptions;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmailNotExistException extends RuntimeException {

    public EmailNotExistException(Throwable cause) {
        super(cause);
    }

    public EmailNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailNotExistException(String message) {
        super(message);
    }

    public EmailNotExistException() {
        super("Email Address Information Not Exist");
    }

    @ExceptionHandler(EmailNotExistException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.NOT_FOUND.value());
        error.setStatusText(ex.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.add("statusText", ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, headers,HttpStatus.NOT_FOUND);
    }

}
