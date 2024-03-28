package com.example.patterns.Abstract;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("Button L");
    }
}