package com.itacademy.java.oop.basics;

import java.util.Date;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee employee = new Employee("Evaldas", "Grublys", Contract.PART_TIME, new Date(), 0f, "Practise");
        Employee.print(employee);
    }
}
