package com.test.main.data;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResultRestExceptionHandler {

  @ExceptionHandler
  public ResponseEntity<ResultErrorResponse> handleException(Exception genericExc) {
    ResultErrorResponse errorResponse = new ResultErrorResponse(HttpStatus.BAD_REQUEST.value(),
        genericExc.getMessage(), System.currentTimeMillis());

    return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
  }
}
