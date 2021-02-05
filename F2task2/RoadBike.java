package com.itacademy.java.oop.basics.F2task2;

public class RoadBike implements Bicycle {

    private int gear;
    private int speed;

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear == -1 || newGear == -2 || newGear == 1 || newGear == 2) {
            if ((this.gear+newGear) >= 0 && (this.gear+newGear) <= 10) {
                this.gear += newGear;
                System.out.printf("Current Road Bike gear is: %s\n", this.gear);
            } else {
                System.out.println("New gear value was either over the max 10 or below 0.");
            }
        } else {
            if (newGear == 0) {
                System.out.println("Gear value is not allowed. ('Maybe use: -1 or 1?')");
            } else if (newGear > 2) {
                System.out.println("Gear value is not allowed. ('Maybe use: 2?')");
            } else {
                System.out.println("Gear value is not allowed. ('Maybe use: -2?')");
            }
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment >= 0) {
            if ((this.speed+increment) > 50) {
                System.out.printf("That speed is too high. ('The highest Road Bike speed increment value is: %s.')\n", 50-this.speed);
            } else {
                this.speed += increment;
                System.out.printf("Current Road Bike speed is: %s\n", this.speed);
            }
        } else {
            System.out.println("Speeding value is negative. ('Maybe use positive value?')");
        }
    }

    @Override
    public void applyBrakes(int decrement) {
        if (decrement < 0) {
            if ((this.speed + decrement) >= 0) {
                this.speed += decrement;
            } else {
                System.out.println("Road Bike speed cannot be negative.");
            }
            System.out.printf("Current Road Bike speed is: %s\n", this.speed);
        } else {
            System.out.println("Braking value is positive. ('Maybe use negative value?')");
        }
    }
}
