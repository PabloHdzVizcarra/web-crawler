package jvm.pablo.webcrawler.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jvm.pablo.webcrawler.exception.InvalidUrlFormatException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends
        ResponseEntityExceptionHandler {

    @ExceptionHandler(InvalidUrlFormatException.class)
    protected ResponseEntity<?> handleInvalidUrlFormatException(
            InvalidUrlFormatException exception, WebRequest request
    ) {
        String bodyOfResponse = exception.getMessage();
        return handleExceptionInternal(
                exception, bodyOfResponse, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
