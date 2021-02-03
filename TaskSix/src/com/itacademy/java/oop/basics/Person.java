package com.itacademy.java.oop.basics;

public class Person {
    private final String name;
    private final String surname;
    private final Gender gender;
    private final int age;

    public Person(String name, String surname, Gender gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name= " + name +
                ", Surname= " + surname +
                ", Gender= " + gender.getDisplayGender() +
                ", Age= " + age + '.';
    }
}
