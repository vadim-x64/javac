package com.example.p_abstraction;

public class Main {
    public static void main (String[] a) {
        Dog dog = new Dog();
        System.out.println("Species " + dog.species());
        dog.sound();
    }
}