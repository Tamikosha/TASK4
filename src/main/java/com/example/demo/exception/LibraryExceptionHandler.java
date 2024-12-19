package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LibraryExceptionHandler {

    @ExceptionHandler(LibraryException.class)
    public ResponseEntity<?> handleLibraryException(LibraryException e) {
        return ResponseEntity.badRequest().build();
    }
}
