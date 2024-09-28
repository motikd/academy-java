package a_MOTI;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        int choice; // Variable to store user choice
        
        do {
            // Display the calculator menu
            System.out.println("/…Calculator Menu…/");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");
            choice = scanner.nextInt(); // Accept user choice
            
            // Execute the selected operation
            switch (choice) {
                case 1: // Addition
                    System.out.print("Enter the first number: ");
                    double add1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double add2 = scanner.nextDouble();
                    System.out.println("The sum of the numbers " + add1 + " and " + add2 + " is = " + (add1 + add2));
                    break;

                case 2: // Subtraction
                    System.out.print("Enter the first number: ");
                    double sub1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double sub2 = scanner.nextDouble();
                    System.out.println("The difference of the numbers " + sub1 + " and " + sub2 + " is = " + (sub1 - sub2));
                    break;

                case 3: // Multiplication
                    System.out.print("Enter the first number: ");
                    double mul1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double mul2 = scanner.nextDouble();
                    System.out.println("The product of the numbers " + mul1 + " and " + mul2 + " is = " + (mul1 * mul2));
                    break;

                case 4: // Division
                    System.out.print("Enter the first number: ");
                    double div1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double div2 = scanner.nextDouble();
                    if (div2 != 0) { // Check for division by zero
                        System.out.println("Dividing " + div1 + " by " + div2 + " the quotient is " + (div1 / div2));
                        System.out.println("The remainder is " + (div1 % div2));
                    } else {
                        System.out.println("Invalid choice! Cannot divide by zero.");
                    }
                    break;

                case 5: // Squaring a number
                    System.out.print("Enter the number to find Square: ");
                    double squareNum = scanner.nextDouble();
                    System.out.println("The Square of the number " + squareNum + " is = " + (squareNum * squareNum));
                    break;

                case 6: // Square root
                    System.out.print("Enter the number to find Square Root: ");
                    double sqrtNum = scanner.nextDouble();
                    if (sqrtNum >= 0) { // Check for negative input
                        System.out.println("The Square Root of the number " + sqrtNum + " is = " + Math.sqrt(sqrtNum));
                    } else {
                        System.out.println("Invalid choice! Cannot find square root of a negative number.");
                    }
                    break;

                case 7: // Reciprocal
                    System.out.print("Enter the number to find Reciprocal: ");
                    double reciprocalNum = scanner.nextDouble();
                    if (reciprocalNum != 0) { // Check for zero input
                        System.out.println("The Reciprocal of the number " + reciprocalNum + " is = " + (1 / reciprocalNum));
                    } else {
                        System.out.println("Invalid choice! Cannot find reciprocal of zero.");
                    }
                    break;

                default: // Invalid choice
                    System.out.println("Invalid choice! Please make a valid choice.");
            }

            // Ask if user wants to continue
            System.out.print("To continue calculation Press 1, else press any other number to exit: ");
            choice = scanner.nextInt();
        } while (choice == 1); // Continue if the user presses 1

        scanner.close(); // Close the scanner
        System.out.println("Program ended."); // End message
    }
}
