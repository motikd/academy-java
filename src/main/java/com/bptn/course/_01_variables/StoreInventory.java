package com.bptn.course._01_variables;

public class StoreInventory {
    public static void main(String[] args) {
        // Primitive data types
        int itemCount = 100;        // Number of items
        double itemPrice = 9.99;    // Price per item
        char itemGrade = 'A';       // Grade of item
        boolean isOnSale = true;    // Is the item on sale?

        // Reference data types
        String storeName = "FreshMart";  // Store name as a String
        int[] quantities = {10, 20, 30}; // Array of item quantities

        // Output information
        System.out.println("Store: " + storeName);
        System.out.println("Item Count: " + itemCount);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("On Sale: " + isOnSale);
    }
}