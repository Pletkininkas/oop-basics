package com.itacademy.java.oop.basics;

public class TravelManager {

    private TravelManager() {
    }

    static void changeDestination(Family family, TravelDestination destination) {
        if (!isDestinationEqual(family.getTravelDestination(), destination)) {
            family.getTravelDestination().setDistance(destination.getDistance());
        }
    }

    static void travel(Family family) {
        if (isAbleToReachDestination(family)) {
            System.out.println("Was able to travel to the destination.");
        } else {
            System.out.println("Was not able to travel to the destination. Missing fuel: " + getMissingFuel(family));
        }
    }

    static void printFamilyMembers(Family family) {
        for (Person person : family.getPeople()) {
            System.out.println(person.toString());
        }
    }

    private static boolean isDestinationEqual(TravelDestination source, TravelDestination dest) {
        // Compare three fields of TravelDestination objects
        return source.getName().equals(dest.getName()) && source.getCity().equals(dest.getCity()) && source.getDistance() == dest.getDistance();
    }

    private static boolean isAbleToReachDestination(Family family) {
        return (family.getVehicle().getFuel() / family.getVehicle().getConsumption()) * 100 > family.getTravelDestination().getDistance();
    }

    private static double getMissingFuel(Family family) {
        double distanceDifference = family.getTravelDestination().getDistance() - (family.getVehicle().getFuel() / family.getVehicle().getConsumption()) * 100;
        return distanceDifference / family.getVehicle().getConsumption();
    }
}
