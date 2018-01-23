package com.framework.core.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CashInTransactionNotExistException extends RuntimeException {

    public CashInTransactionNotExistException(Throwable cause) {
        super(cause);
    }

    public CashInTransactionNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public CashInTransactionNotExistException(String message) {
        super(message);
    }

    public CashInTransactionNotExistException() {
        super("Cash In Transaction Information Not Exist");
    }


    @ExceptionHandler(CashInTransactionNotExistException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.NOT_FOUND.value());
        error.setStatusText(ex.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.add("statusText", ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, headers,HttpStatus.NOT_FOUND);
    }
}
