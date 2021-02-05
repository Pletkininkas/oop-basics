package com.itacademy.java.oop.basics.F2task2;

public class MountainBike implements Bicycle {

    private int gear;
    private int speed;

    public MountainBike(int gear, int speed) {
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
        if ((newGear == 1 || newGear == -1)) {
            if ((this.gear + newGear) >= 0 || (this.gear + newGear) <= 20) {
                this.gear += newGear;
                System.out.printf("Current Mountain Bike gear is: %s\n", this.gear);
            } else {
                System.out.println("Could not change gear. ('The gear shift was over the max 20 or below 0.')");
            }
        } else {
            System.out.println("Value is not allowed. ('Use 1 or -1 to shift gear.')");
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment >= 0) {
            if ((this.speed+increment) <= 100) {
                this.speed += increment;
                System.out.printf("Current Mountain Bike speed is: %s\n", this.speed);
            } else {
                System.out.printf("That speed is too high. ('The highest possible increment is %d.')\n", 100-this.speed);
            }
        } else {
            System.out.println("Speeding value is negative. ('Maybe use positive value?')");
        }
    }

    @Override
    public void applyBrakes(int decrement) {
        if (decrement >= 0) {
            if ((this.speed - decrement) >= -10) {
                this.speed -= decrement;
                System.out.printf("Current Mountain Bike speed is: %s\n", this.speed);
            } else {
                System.out.printf("Value is too high. The highest Mountain Bike brake value is: %s.\n", this.speed+10);
            }
        } else {
            System.out.println("Braking value is negative. ('Maybe use positive value?')");
        }
    }
}
