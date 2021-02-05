package com.itacademy.java.oop.basics.F2task3.exceptions;

public class InsufficientAtmFundsException extends Exception {

    public InsufficientAtmFundsException() {
    }

    public InsufficientAtmFundsException(String message) {
        super(message);
    }
}
