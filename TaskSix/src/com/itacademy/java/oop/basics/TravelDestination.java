package com.itacademy.java.oop.basics;

public class TravelDestination {
    private final String name;
    private final String city;
    private double distance;

    public TravelDestination(String name, String city, double distance) {
        this.name = name;
        this.city = city;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "TravelDestination{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", distance=" + distance +
                '}';
    }
}
