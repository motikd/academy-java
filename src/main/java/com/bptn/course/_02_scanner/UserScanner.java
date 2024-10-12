package com.bptn.course._02_scanner;

// Step 1. Import Scanner
import java.util.Scanner;

class UserScanner {
    public static void main(String[] args) {
        // Step 2. Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Sample bill amount
        float billAmount = 500.00f;

        // If-Else Statement
        boolean isOnSale = true;
        if (isOnSale) {
            if (billAmount > 250.00) {
                System.out.println("Extra discount!");
            } else {
                System.out.println("The sale is on!");
            }
        } else {
            System.out.println("The sale is off!");
        }

        // Ternary Operator
        String saleStatus = (billAmount > 250.00) ? "The sale is on!" : "The sale is off!";
        System.out.println(saleStatus);

        // Else-If Ladder
        int productCount = 25;
        if (productCount == 1) {
            System.out.println("We recommend no bag");
        } else if (productCount > 1 && productCount <= 5) {
            System.out.println("We recommend 1 bag");
        } else if (productCount > 5 && productCount <= 10) {
            System.out.println("We recommend 2 bags");
        } else if (productCount > 10 && productCount <= 15) {
            System.out.println("We recommend 3 bags");
        } else {
            System.out.println("Home delivery");
        }

        // Scanner input example
        System.out.print("Enter a line of text: ");
        String readLine = scanner.nextLine();
        System.out.println("You entered: " + readLine);

        // Check for integer input
        System.out.println("Please enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("That is not a number");
        }

        // Step 3. Close Scanner
        scanner.close();
    }
}
