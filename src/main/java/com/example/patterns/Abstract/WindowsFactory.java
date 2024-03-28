package com.example.patterns.Abstract;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button newButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox newCheckbox () {
        return new WindowsCheckbox();
    }
}