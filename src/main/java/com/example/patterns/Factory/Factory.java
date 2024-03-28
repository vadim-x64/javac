package com.example.patterns.Factory;

public class Factory {
    public Car createCar(String item) {
        if (item.equalsIgnoreCase("Muscle")) {
            return new Muscle();
        } else if (item.equalsIgnoreCase("Sport")) {
            return new Sport();
        } else if (item.equalsIgnoreCase("Jeep")) {
            return new Jeep();
        }
        return null;
    }
}