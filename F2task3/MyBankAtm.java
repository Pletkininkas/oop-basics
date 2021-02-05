package com.itacademy.java.oop.basics.task3;

import com.itacademy.java.oop.basics.task3.exceptions.*;

public class MyBankAtm implements Atm {

    private double balance;

    public MyBankAtm() {
    }

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(Card card, double amount) throws InsufficientAtmFundsException {
        System.out.println(balance);
        if ((balance - amount) >= 0) {
            card.debit(amount);
            balance -= amount;
        } else {
            throw new InsufficientAtmFundsException("Atm has insufficient balance to make this transaction.");
        }
    }
}
