package com.itacademy.java.oop.basics;

public enum Contract {
    FULL_TIME("Full-Time"), PART_TIME("Part-Time");

    private final String name;

    Contract(String contractName) {
        this.name = contractName;
    }

    public String getDisplayName() {
        return name;
    }
}
