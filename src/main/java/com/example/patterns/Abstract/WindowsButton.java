package com.example.patterns.Abstract;

public class WindowsButton implements Button {
    @Override
    public void render(){
        System.out.println("Button");
    }
}