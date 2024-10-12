package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Mobile Data Plan Selector!");
        System.out.println("Please select a data plan:");
        System.out.println("1. 1 GB - $10");
        System.out.println("2. 5 GB - $30");
        System.out.println("3. 10 GB - $50");
        System.out.println("4. Unlimited - $70");
        System.out.println("5. Exit");

        System.out.print("Enter the number corresponding to your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have selected the 1 GB plan.");
                System.out.println("The total cost of your selected plan is: $10.00");
                break;
            case 2:
                System.out.println("You have selected the 5 GB plan.");
                System.out.println("The total cost of your selected plan is: $30.00");
                break;
            case 3:
                System.out.println("You have selected the 10 GB plan.");
                System.out.println("The total cost of your selected plan is: $50.00");
                break;
            case 4:
                System.out.println("You have selected the Unlimited plan.");
                System.out.println("The total cost of your selected plan is: $70.00");
                break;
            case 5:
                System.out.println("Exiting the Mobile Data Plan Selector. Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid selection. Please choose a valid data plan.");
                break;
        }

        scanner.close();
    }
}
