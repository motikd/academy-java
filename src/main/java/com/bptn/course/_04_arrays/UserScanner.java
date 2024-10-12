package com.bptn.course._04_arrays;

// CRUD Operations
// - CREATE
// - READ
// - UPDATE
// - DELETE

import java.util.Scanner;

class UserScanner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Example with temperature data for the week
        float[] weekData = new float[7];
        float averageTemperature = 0.0f;
        float totalTemperature = 0.0f;

        System.out.println("Enter the temperature for the week: ");
        for (int i = 0; i < 7; i++) {
            weekData[i] = scanner.nextFloat();
        }

        for (float temp : weekData) {
            totalTemperature += temp;
        }

        averageTemperature = totalTemperature / weekData.length;
        System.out.println("Average Temperature is: " + averageTemperature);

        // Example of basic array operations
        int[] myArray = new int[5]; // initialization of array with 5 elements

        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < 5; i++) {
            myArray[i] = scanner.nextInt();
        }

        System.out.println("Values in the array are:");
        for (int i = 0; i < 5; i++) {
            System.out.println(myArray[i]);
        }

        // For Each Loop
        System.out.println("Using a for-each loop:");
        for (int i : myArray) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}
