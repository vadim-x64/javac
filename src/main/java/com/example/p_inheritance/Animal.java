package com.example.p_inheritance;

public class Animal {

    String species;

    public Animal(String species) {
        this.species = species;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
