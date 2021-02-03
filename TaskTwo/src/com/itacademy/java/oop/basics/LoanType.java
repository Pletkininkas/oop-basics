package com.itacademy.java.oop.basics;

public enum LoanType {
    LEASING("Leasing"), CONSUMER("Consumer");

    private final String consumer;

    LoanType(String consumer) {
        this.consumer = consumer;
    }
}
