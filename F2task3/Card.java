package com.itacademy.java.oop.basics.task3;

public abstract class Card {

    private double balance;
    private final String cardHolderName;
    private final String cardNumber;

    public Card(double balance, String cardHolderName, String cardNumber) {
        this.balance = balance;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    abstract void credit(double amount);
    abstract void debit(double amount);
}
