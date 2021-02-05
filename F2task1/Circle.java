package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius= " + radius +
                ", area= " + calculateArea() +
                ", perimeter= " + calculatePerimeter() +
                '.';
    }
}
