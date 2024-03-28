package com.example.patterns.Factory;

public class Main {
    public static void main(String[] args) {
        Factory f = new Factory();

        Car muscle = f.createCar("Muscle");
        muscle.drive();

        Car sport = f.createCar("Sport");
        sport.drive();

        Car jeep = f.createCar("Jeep");
        jeep.drive();
    }
}