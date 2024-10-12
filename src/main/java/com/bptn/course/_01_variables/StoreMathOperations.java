package com.bptn.course._01_variables;

public class StoreMathOperations {
    public static void main(String[] args) {
        double pricePerApple = 0.5;
        int appleCount = 12;
        double discount = 1.0;

        // Calculate total price
        double totalPrice = pricePerApple * appleCount;
        System.out.println("Total price before discount: $" + totalPrice);

        // Apply discount
        totalPrice -= discount;
        System.out.println("Total price after discount: $" + totalPrice);

        // Compare prices and quantities
        if (totalPrice > 5 && appleCount >= 10) {
            System.out.println("You bought more than 10 apples, and the total price exceeds $5.");
        } else {
            System.out.println("Either you bought fewer apples, or the total price is below $5.");
        }

        // Calculate leftover apples
        int leftoverApples = appleCount % 4;
        System.out.println("Leftover apples after packing: " + leftoverApples);
    }
}