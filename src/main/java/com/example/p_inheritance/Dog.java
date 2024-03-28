package com.example.p_inheritance;

public class Dog extends Animal{

    public Dog(String name) {
        super("Dog");
        this.name = name;
    }

    String name;
    @Override
    public void sound () {
        System.out.println("Woof");
    }


    public void action() {
        System.out.println("His name is " + name + " and he wags tail");
    }


}
