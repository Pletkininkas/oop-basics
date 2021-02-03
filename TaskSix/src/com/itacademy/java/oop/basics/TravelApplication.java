package com.itacademy.java.oop.basics;

public class TravelApplication {

    public static void main(String[] args) {
        Family familyOne = new Family(
                new Person[] { new Person("Evaldas", "Grublys", Gender.MAN, 20),
                               new Person("Vardenis", "Pavardenis", Gender.MAN, 20) },
                new Vehicle("Civic", "Honda", 45, 6),
                new TravelDestination("Atostogos", "Talinas", 597.9));
        Family familyTwo = new Family(
                new Person[] { new Person("Evaldas", "Grublys", Gender.MAN, 20),
                        new Person("Evaldas", "Grublys", Gender.MAN, 20) },
                new Vehicle("Batman", "BMW", 8, 4),
                new TravelDestination("Kurortas", "Palanga", 331.2));

        TravelManager.printFamilyMembers(familyOne);
        TravelManager.travel(familyOne);
        TravelManager.travel(familyTwo);
        TravelManager.changeDestination(familyOne, new TravelDestination("Kurortas", "Niekados salis", 30000));
        TravelManager.travel(familyOne);
    }
}
