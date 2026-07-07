package com.cuckooy.ocpp.v16.server.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = {NoSuchElementException.class})
    public ProblemDetail handle(NoSuchElementException e) {
        logger.warn("Handle {}, message: {}", e.getClass().getSimpleName(), e.getMessage(), e);
        return ProblemDetail.forStatusAndDetail(HttpStatus.GONE, e.getMessage());
    }

    @ExceptionHandler(value = {IllegalArgumentException.class})
    public ProblemDetail handle(IllegalArgumentException e) {
        logger.warn("Handle {}, message: {}", e.getClass().getSimpleName(), e.getMessage(), e);
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
    }

    @ExceptionHandler(value = {Exception.class})
    public ProblemDetail handle(Exception e) {
        logger.warn("Handle {}, message: {}", e.getClass().getSimpleName(), e.getMessage(), e);
        return ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
    }

}

