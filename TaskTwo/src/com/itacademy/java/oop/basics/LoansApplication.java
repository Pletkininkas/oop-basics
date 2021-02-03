package com.itacademy.java.oop.basics;

public class LoansApplication {

    public static void main(String[] args) {
        Loan loanOne = new Loan();
        Loan loanTwo = new Loan(2, 300.45, LoanType.LEASING, "2021-03-15");
        loanOne = new Loan(1, 200.49, LoanType.CONSUMER, "2021-02-10");

        Loan[] loans = new Loan[]{loanOne, loanTwo};

        Customer customer = new Customer("Petras", "Petrauskas", 35, 2946, loans);
        Customer.print(customer);
    }
}
