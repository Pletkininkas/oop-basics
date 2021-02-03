package com.itacademy.java.oop.basics;

public class Loan {

    private int id;
    private double amount;
    private LoanType type;
    private String terminationDate;

    public Loan() {
    }

    public Loan(int id, double amount, LoanType type, String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.terminationDate = terminationDate;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public LoanType getType() {
        return type;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    @Override
    public String toString() {
        return "\nLoan: " +
                "id= " + id +
                ", amount= " + amount +
                ", loanType= " + type +
                ", terminationDate= " + terminationDate;
    }
}
