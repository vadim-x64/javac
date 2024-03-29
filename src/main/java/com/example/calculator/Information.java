package com.example.calculator;

import java.util.Scanner;

public class Information {
    public void showInfo() {
        Scanner input = new Scanner(System.in);

        String ANSI_RESET = "\u001B[0m";
        String ANSI_BRIGHT_YELLOW = "\u001B[93m";
        String ANSI_BRIGHT_RED = "\u001B[31m";

        System.out.println("\t\t\t\t    WELCOME TO OUR CALCULATOR");
        System.out.println("\t\t--------------------------------------------------");
        System.out.println("""
                \t\tIf you choose first item in a menu you go to
                \t\tcalculator and you can continue your calculation
                \t\tor you can back to home, just write 'no'\s""" + "\n");

        System.out.println("""
                \t\tIf you are asked 'Do you wanna continue? (yes/no)'
                \t\tyou can ignore uppercase or lowercase letters\s""" + "\n");

        System.out.println(ANSI_BRIGHT_YELLOW + "\t\tIf you wanna exit, just write 'no' or 'n'" + ANSI_RESET);

        boolean exitOper = false;

        while (!exitOper) {
            String enteredValue = input.next();

            if (enteredValue.equalsIgnoreCase("n") || enteredValue.equalsIgnoreCase("no")) {
                exitOper = true;
            } else {
                System.out.println(ANSI_BRIGHT_RED + "\nEntered value is invalid. Please, try again!" + ANSI_RESET);
            }
        }
    }
}