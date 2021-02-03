package com.itacademy.java.oop.basics;

public enum Gender {
    MAN("Man"), WOMAN("Woman");

    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getDisplayGender() {
        return gender;
    }
}
