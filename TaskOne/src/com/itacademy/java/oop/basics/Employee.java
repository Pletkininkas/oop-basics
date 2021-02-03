package com.itacademy.java.oop.basics;

import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    private Contract contract;
    private Date startDate;
    private float salary;
    private String position;

    public Employee() {

    }

    public Employee(String name, String surname, Contract contract, Date startDate, float salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contract = contract;
        this.startDate = startDate;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Contract getContract() {
        return contract;
    }

    public Date getStartDate() {
        return startDate;
    }

    public float getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public static void print(Employee employee) {
        System.out.println(employee.toString());
    }

    @Override
    public String toString() {
        return "Employee: " +
                "Name= " + name + ", Surname= " + surname +
                ", Contract Type= " + contract.getDisplayName() +
                ", Start Date= " + startDate +
                ", Salary= " + salary +
                ", Position= " + position +
                '.';
    }
}
