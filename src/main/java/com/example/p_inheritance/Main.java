package com.example.p_inheritance;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new  Dog("Friend");
        System.out.println("Species " + d1.species);
        d1.sound();
        d1.action();

        Cat c1 = new Cat ("Murka");
        System.out.println("Species " + c1.species);
        c1.sound();
        c1.actions();
    }
}
