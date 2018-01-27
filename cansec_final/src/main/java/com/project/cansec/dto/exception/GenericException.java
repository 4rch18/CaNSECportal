package com.project.cansec.dto.exception;

public class GenericException {

    private String message;

    public GenericException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
