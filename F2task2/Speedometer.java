package com.itacademy.java.oop.basics.F2task2;

public class Speedometer {

    static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        return chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed());
    }

    static Bike chooseWinner(RoadBike roadBike, MountainBike mountainBike) {
        return chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed());
    }

    static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        } else {
            return Bike.ROAD;
        }
    }
}
