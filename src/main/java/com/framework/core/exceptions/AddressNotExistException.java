package com.framework.core.exceptions;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AddressNotExistException extends RuntimeException {

    public AddressNotExistException(Throwable cause) {
        super(cause);
    }

    public AddressNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressNotExistException(String message) {
        super(message);
    }

    public AddressNotExistException() {
        super("Address Information Not Exist");
    }

    @ExceptionHandler(AddressNotExistException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.NOT_FOUND.value());
        error.setStatusText(ex.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.add("statusText", ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, headers,HttpStatus.NOT_FOUND);
    }

}
