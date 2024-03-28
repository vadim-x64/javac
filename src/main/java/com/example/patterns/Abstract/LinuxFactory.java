package com.example.patterns.Abstract;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button newButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox newCheckbox() {
        return new LinuxCheckbox();
    }
}