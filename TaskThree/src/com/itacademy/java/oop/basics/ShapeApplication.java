package com.itacademy.java.oop.basics;

public class ShapeApplication {

    public static void main(String[] args) {
        Square square = new Square();
        square = new Square(-1.7, 2.9);
        Square[] squares = new Square[]{new Square(10.0, 15.9), square};

        for (Square sq : squares) {
            if (sq.getLength() < 0 || sq.getWidth() < 0) {
                Square.print(sq);
            } else {
                Square.printDetailed(sq);
            }
        }
    }
}
