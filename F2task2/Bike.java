package com.itacademy.java.oop.basics.task2;

public enum Bike {
    MOUNTAIN("mountain"), ROAD("road");

    private final String road;

    Bike(String road) {
        this.road = road;
    }

    public String display() {
        return road;
    }
}
