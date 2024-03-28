package com.example.p_polymorphism.dynamic;

public class Main {
    public static void main (String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Lion();
        Animal a4 = new Bird();
        Animal a5 = new Fish();
        a1.sound();
        a2.sound();
        a3.sound();
        a4.sound();
        a5.swim();
    }
}
