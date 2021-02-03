package com.itacademy.java.oop.basics;

public class Vehicle {
    private final String name;
    private final String brand;
    private final double fuel;
    private final double consumption;

    public Vehicle(String name, String brand, double fuel, double consumption) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getFuel() {
        return fuel;
    }

    public double getConsumption() {
        return consumption;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", fuel=" + fuel +
                ", consumption=" + consumption +
                '}';
    }
}
