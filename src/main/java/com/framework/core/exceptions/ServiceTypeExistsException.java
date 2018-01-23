package com.framework.core.exceptions;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ServiceTypeExistsException extends RuntimeException {

    public ServiceTypeExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceTypeExistsException(String message) {
        super(message);
    }

    public ServiceTypeExistsException() {
        super("Service Type Information Exist");
    }


    @ExceptionHandler(ServiceTypeExistsException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.CONFLICT.value());
        error.setStatusText(ex.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.add("statusText", ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, headers,HttpStatus.CONFLICT);
    }
}
