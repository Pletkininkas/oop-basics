package com.itacademy.java.oop.basics.F2task3.exceptions;

public class NotEnoughBalanceException extends RuntimeException {

    public NotEnoughBalanceException() {
    }

    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
