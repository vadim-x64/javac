package com.example.calculator;

import java.util.Scanner;

public class Menu extends Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ANSI_RESET = "\u001B[0m";
        String ANSI_BRIGHT_RED = "\u001B[31m";

        while (true) {
            System.out.println(" ");
            System.out.println("1. CALCULATOR");
            System.out.println("2. INFORMATION");
            System.out.println("3. EXIT");

            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    Calculator calculator = new Calculator();
                    calculator.calculation();
                    break;
                case 2:
                    Information information = new Information();
                    information.showInfo();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println(ANSI_BRIGHT_RED + "Entered value is invalid! Please, try again!" + ANSI_RESET);
            }
        }
    }
}