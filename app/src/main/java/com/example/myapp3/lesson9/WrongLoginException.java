package com.example.myapp3.lesson9;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
