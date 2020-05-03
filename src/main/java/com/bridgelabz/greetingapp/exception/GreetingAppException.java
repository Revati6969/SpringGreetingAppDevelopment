package com.bridgelabz.greetingapp.exception;

public class GreetingAppException extends Exception {
    ExceptionType type;

    public GreetingAppException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public enum ExceptionType {
        DATA_NOT_FOUND;
    }
}
