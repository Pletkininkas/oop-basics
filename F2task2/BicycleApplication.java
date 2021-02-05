package com.itacademy.java.oop.basics.F2task2;

public class BicycleApplication {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(2, 17);
        RoadBike roadBike = new RoadBike(1, 15);

        mountainBike.speedUp(10);
        mountainBike.speedUp(74);
        mountainBike.applyBrakes(10);
        mountainBike.applyBrakes(29);
        mountainBike.changeGear(-10);
        mountainBike.changeGear(10);
        mountainBike.changeGear(1);
        mountainBike.changeGear(-1);
        System.out.println();
        roadBike.speedUp(10);
        roadBike.speedUp(50);
        roadBike.applyBrakes(-10);
        roadBike.applyBrakes(-18);
        roadBike.changeGear(-10);
        roadBike.changeGear(-2);
        roadBike.changeGear(10);
        roadBike.changeGear(2);

        Speedometer.chooseWinner(roadBike, mountainBike);

    }
}
