package com.itacademy.java.oop.basics;

public class Square {

    private double length;
    private double width;

    public Square() {
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public static void print(Square square) {
        System.out.println(square.toString());
    }

    public static void printDetailed(Square square) {
        System.out.println(square.toString() + " Perimeter= " + square.getPerimeter() + ", Area= " + square.getArea() + '.');
    }

    @Override
    public String toString() {
        return "Length= " + length +
                ", width= " + width +
                '.';
    }
}
