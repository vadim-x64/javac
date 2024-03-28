package com.example.p_encapsulation;

public class Home {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Vadim");
        p1.setAge(18);
        p1.setHeight(1.75);
        p1.setLastName("Voitsekhovskiy");
        p1.setJob("Student");
        System.out.println(p1);
    }
}