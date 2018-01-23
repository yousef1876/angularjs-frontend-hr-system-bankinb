package com.framework.core.exceptions;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PhoneNumberNotExistException extends RuntimeException {

    public PhoneNumberNotExistException(Throwable cause) {
        super(cause);
    }

    public PhoneNumberNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public PhoneNumberNotExistException(String message) {
        super(message);
    }

    public PhoneNumberNotExistException() {
        super("Phone No. Information Not Exist");
    }

    @ExceptionHandler(PhoneNumberNotExistException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.NOT_FOUND.value());
        error.setStatusText(ex.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.add("statusText", ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, headers,HttpStatus.NOT_FOUND);
    }

}
