package com.itacademy.java.oop.basics.F2task3;

import com.itacademy.java.oop.basics.F2task3.exceptions.InsufficientAtmFundsException;

public interface Atm {
    void withdraw(Card creditCard, double amount) throws InsufficientAtmFundsException, InsufficientAtmFundsException;
}
