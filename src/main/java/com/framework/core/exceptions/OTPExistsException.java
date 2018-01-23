package com.framework.core.exceptions;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OTPExistsException extends RuntimeException {

    public OTPExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public OTPExistsException(String message) {
        super(message);
    }

    public OTPExistsException() {
        super("OTP Information Exist");
    }


    @ExceptionHandler(OTPExistsException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.CONFLICT.value());
        error.setStatusText(ex.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.add("statusText", ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, headers,HttpStatus.CONFLICT);
    }
}
