package com.itacademy.java.oop.basics.task3.exceptions;

public class NotEnoughCreditException extends RuntimeException {

    public NotEnoughCreditException() {
    }

    public NotEnoughCreditException(String message) {
        super(message);
    }
}
