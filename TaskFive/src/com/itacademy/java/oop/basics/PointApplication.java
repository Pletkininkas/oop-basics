package com.itacademy.java.oop.basics;

public class PointApplication {

    public static void main(String[] args) {
        MyPoint pointOne = new MyPoint(5,12);
        MyPoint pointTwo = new MyPoint(2,3);

        System.out.println("Point one X: " + pointOne.getX());
        System.out.println("Point one Y: " + pointOne.getY());
        System.out.println("Point one XY: (" + pointOne.getXY()[0] + ',' + pointOne.getXY()[1] + ')');
        System.out.println("Point one distance from (2,3): " + pointOne.distance(2,3));
        System.out.println("Point one distance from point two: " + pointOne.distance(pointTwo));
        System.out.println("Point two distance from (0,0): " + pointTwo.distance());

        for (MyPoint point : new MyPoint[] { pointOne }) {
            System.out.println('(' + point.getXY()[0] + ',' + point.getXY()[1] + ')');
        }

        System.out.println('(' + pointTwo.getXY()[0] + ',' + pointTwo.getXY()[1] + ')');
    }
}
