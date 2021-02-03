package com.itacademy.java.oop.basics;

public class AccountApplication {

    public static void main(String[] args) {
        Account userOne = new Account("1", "Julius", 100);
        Account userTwo = new Account("2", "Petras", 50);

        userOne.credit(20);
        userOne.credit(10);
        Account.printBalance(userOne);

        userTwo.credit(10);
        Account.printBalance(userTwo);

        userOne.debit(500);
        userTwo.transferTo(userOne, 70);

        userOne.debit(30);
        Account.printBalance(userOne);

        userOne.transferTo(userTwo, 10);

        Account.printBalance(userOne);
        Account.printBalance(userTwo);

        System.out.println(userOne.toString());
        System.out.println(userTwo.toString());
    }
}
