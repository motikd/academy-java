package com.bptn.course._04_arrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        int[][] grades = {
            {85, 90},
            {88, 92},
            {70, 65}
        };

        // Find and print the maximum element in each row
        for (int i = 0; i < grades.length; i++) {
            int max = grades[i][0];  // Start with the first element of the row
            for (int j = 1; j < grades[i].length; j++) {
                if (grades[i][j] > max) {
                    max = grades[i][j];  // Update max if a larger element is found
                }
            }
            System.out.println("The maximum element in row " + i + " is: " + max);
        }
    }
}

