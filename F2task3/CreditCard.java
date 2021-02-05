package com.itacademy.java.oop.basics.F2task3;

import com.itacademy.java.oop.basics.F2task3.exceptions.NotEnoughCreditException;

public class CreditCard extends Card {

    private final double interest;
    private final double credit;

    public CreditCard(double interest, double credit, double balance, String cardHolderName, String cardNumber) {
        super(balance, cardHolderName, cardNumber);
        this.interest = interest;
        this.credit = credit;
    }

    public void setInterest(double interest) {
        interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void credit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void debit(double amount) {
        double amountWithInterest = amount + ((amount / 100) * interest);
        if ((getBalance() - amountWithInterest) >= (-credit)) {
            setBalance(getBalance() - amountWithInterest);
        } else {
            throw new NotEnoughCreditException("You are exceeding credit card limitation.");
        }
    }

    @Override
    public String toString() {
        return "CreditCard: " +
                "CardHolderName= " + getCardHolderName() +
                ", CardNumber= " + getCardNumber() +
                ", Balance= " + getBalance() +
                ", Interest= " + interest +
                ", Credit= " + credit +
                '.';
    }
}
