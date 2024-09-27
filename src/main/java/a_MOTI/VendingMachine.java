package a_MOTI; // Package declaration at the top to organize the class within a namespace.

import java.util.Scanner; // Importing the Scanner class to enable user input.

public class VendingMachine { // Declaring the VendingMachine class.
    public static void main(String[] args) { // Main method where the program execution begins.
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for input.
        
        // Array of product names with prices for display.
        String[] products = {"1. Soda - $1.50", "2. Chips - $1.00", "3. Candy - $0.75"};
        double[] prices = {1.50, 1.00, 0.75}; // Array of product prices corresponding to the products.

        System.out.println("Available Products:"); // Prompting the user to view the available products.
        for (String product : products) { // Looping through each product to display them.
            System.out.println(product); // Displaying the product name and price.
        }

        System.out.print("Please select a product (1-3): "); // Asking the user to select a product.
        int choice = scanner.nextInt(); // Reading the user's product choice.

        // Validating the user's choice to ensure it is within the available range.
        if (choice < 1 || choice > products.length) {
            System.out.println("Invalid selection. Please restart."); // Informing the user of an invalid selection.
            return; // Exiting the method to end the program.
        }

        System.out.print("Enter the amount you wish to pay: $"); // Asking for the payment amount.
        double payment = scanner.nextDouble(); // Reading the payment amount.

        double productPrice = prices[choice - 1]; // Getting the price of the selected product based on the user's choice.

        // Checking if the payment is sufficient to purchase the selected product.
        if (payment >= productPrice) {
            double change = payment - productPrice; // Calculating the change to be given back to the user.
            System.out.printf("Dispensing %s. Your change is $%.2f.%n", products[choice - 1], change); // Dispensing the product and displaying change.
        } else { // If the payment is insufficient
            System.out.println("Insufficient payment. Would you like to retry? (yes/no)"); // Prompting the user for action.
            scanner.nextLine(); // Clearing the buffer to avoid issues with nextLine() after nextDouble().
            String response = scanner.nextLine(); // Reading the user's response.
            if (response.equalsIgnoreCase("yes")) { // If the user wants to retry
                main(args); // Restarting the simulation by calling the main method again.
            } else {
                System.out.println("Transaction cancelled."); // Informing the user that the transaction has been cancelled.
            }
        }

        scanner.close(); // Closing the scanner to free up resources.
    }
}
