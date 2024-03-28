package com.example.p_polymorphism.statics;

public class Main {
    public static void main (String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(500, 1500));
        System.out.println(c.add(1.85, 44.55));
    }
}