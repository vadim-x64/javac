package com.example.p_abstraction;

public abstract class Animal {
    public abstract String species();
    public void sound() {
        System.out.println("This animal makes sound");
    }
}