package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    private Loan[] loans;

    public Customer() {
    }

    public Customer(String name, String surname, int age, int personalNumber, Loan[] loans) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public Loan[] getLoan() {
        return loans;
    }

    public static void print(Customer customer) {
        System.out.println(customer.toString());
    }

    @Override
    public String toString() {
        return "Customer: " +
                "Name= " + name + ' ' + surname +
                ", Age= " + age +
                ", Personal Number= " + personalNumber +
                ",\nLoans=" + Arrays.toString(loans);
    }
}
