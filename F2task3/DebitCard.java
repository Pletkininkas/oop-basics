package com.itacademy.java.oop.basics.F2task3;

import com.itacademy.java.oop.basics.F2task3.exceptions.NotEnoughBalanceException;

public class DebitCard extends Card {

    public DebitCard(double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
    }

    @Override
    void credit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    void debit(double amount) {
        if ((getBalance() - amount) >= 0) {
            setBalance(getBalance() - amount);
        } else {
            throw new NotEnoughBalanceException("You are exceeding debit card balance limitation.");
        }
    }

    @Override
    public String toString() {
        return "DebitCard: " +
                "CardHolderName= " + getCardHolderName() +
                ", CardNumber= " + getCardNumber() +
                ", Balance= " + getBalance() +
                '.';
    }
}
