package com.project.cansec.controller;

import com.project.cansec.dto.exception.GenericException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public GenericException defaultExceptionHandler(Exception ex){
        ex.printStackTrace();
        return new GenericException("Something went wrong");
    }

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public GenericException defaultRuntimeExceptionHandler(RuntimeException rex){
        rex.printStackTrace();
        return new GenericException("Something went wrong");
    }
}
