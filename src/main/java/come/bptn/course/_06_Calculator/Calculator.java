import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Display the calculator menu
            System.out.println("Calculator Menu:");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 to Square a Number");
            System.out.println("Press 6 to Find the Square Root");
            System.out.println("Press 7 to Find the Reciprocal");
            System.out.print("Enter your choice: ");
            int operation = scanner.nextInt();

            // Variables to store the numbers
            double num1, num2, result = 0;

            // Perform the selected operation
            if (operation == 1) {  // Addition
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + result);
            } else if (operation == 2) {  // Subtraction
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("The difference between the numbers " + num1 + " and " + num2 + " is = " + result);
            } else if (operation == 3) {  // Multiplication
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
            } else if (operation == 4) {  // Division
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The quotient when " + num1 + " is divided by " + num2 + " is = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            } else if (operation == 5) {  // Square a number
                System.out.print("Enter the number: ");
                num1 = scanner.nextDouble();
                result = num1 * num1;
                System.out.println("The square of " + num1 + " is = " + result);
            } else if (operation == 6) {  // Square root
                System.out.print("Enter the number: ");
                num1 = scanner.nextDouble();
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                    System.out.println("The square root of " + num1 + " is = " + result);
                } else {
                    System.out.println("Square root of a negative number is not real.");
                }
            } else if (operation == 7) {  // Reciprocal
                System.out.print("Enter the number: ");
                num1 = scanner.nextDouble();
                if (num1 != 0) {
                    result = 1 / num1;
                    System.out.println("The reciprocal of " + num1 + " is = " + result);
                } else {
                    System.out.println("Reciprocal of zero is not defined.");
                }
            } else {
                System.out.println("Invalid choice! Please try again.");
            }

            // Option to continue or exit
            System.out.print("To continue calculation Press 1, else press any other number to exit: ");
            choice = scanner.nextInt();
        } while (choice == 1);

        System.out.println("Calculator exited.");
        scanner.close();
    }
}
