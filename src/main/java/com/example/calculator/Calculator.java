package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public void calculation() {
        Scanner input = new Scanner(System.in);

        String ANSI_RESET = "\u001B[0m";
        String ANSI_BRIGHT_GREEN = "\u001B[92m";
        String ANSI_BRIGHT_YELLOW = "\u001B[93m";
        String ANSI_BRIGHT_RED = "\u001B[31m";

        System.out.println(ANSI_BRIGHT_YELLOW + "\nDo you wanna continue? (yes/no)" + ANSI_RESET);

        boolean continueOper = false;

        while (!continueOper) {
            String choice = input.next();

            if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
                continueOper = true;
            } else if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")) {
                return;
            } else {
                System.out.println(ANSI_BRIGHT_RED + "\nEntered value is invalid. Please, try again!" + ANSI_RESET);
            }
        }

        while (true) {
            System.out.print("\nPlease, enter the first number: ");
            double first;

            if (input.hasNext("-?\\d*\\.?\\d+")) {
                first = Double.parseDouble(input.next());
            } else {
                System.out.println(ANSI_BRIGHT_RED + "Entered number is invalid. Please, try again!" + ANSI_RESET);
                input.next();
                continue;
            }

            while (true) {
                double second = 0;
                boolean validNum = false;

                while (!validNum) {
                    System.out.print("\nPlease, enter the second number: ");

                    if (input.hasNext("-?\\d*\\.?\\d+")) {
                        second = Double.parseDouble(input.next());
                        validNum = true;
                    } else {
                        System.out.println(ANSI_BRIGHT_RED + "Entered number is invalid. Please try again!" +  ANSI_RESET);
                        input.next();
                    }
                }

                String operation = "";
                boolean validOper = false;

                while (!validOper) {
                    System.out.print("\nPlease, enter the operation: ");

                    if (input.hasNext("[+\\-*/]")) {
                        operation = input.next();
                        validOper = true;
                    } else {
                        System.out.println(ANSI_BRIGHT_RED + "Entered operation is invalid. Please, try again!" +  ANSI_RESET);
                        input.nextLine();
                        input.next();
                    }
                }

                double result;

                switch (operation) {
                    case "+":
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        if (second == 0) {
                            System.out.println(ANSI_BRIGHT_RED + "You can't divide by zero. Please try again!" + ANSI_RESET);
                            continue;
                        } else {
                            result = first / second;
                        }
                        break;
                    default:
                        continue;
                }

                System.out.println(ANSI_BRIGHT_GREEN + "\nYour result is " + result + ANSI_RESET);
                System.out.println(ANSI_BRIGHT_YELLOW + "\nDo you wanna continue? (yes/no)" + ANSI_RESET);

                boolean choiceVar = false;

                while (!choiceVar) {
                    String choice = input.next();

                    if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
                        choiceVar = true;
                    } else if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")) {
                        return;
                    } else {
                        System.out.println(ANSI_BRIGHT_RED + "\nEntered value is invalid. Please, try again!" + ANSI_RESET);
                    }
                }
                break;
            }
        }
    }
}