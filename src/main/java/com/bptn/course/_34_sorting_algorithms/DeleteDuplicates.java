package com.bptn.course._34_sorting_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DeleteDuplicates {

    /*
     * This method deletes duplicates from an unsorted ArrayList.
     * @param nums the sorted ArrayList with duplicates
     * @return a sorted ArrayList without duplicates
     */
    public static List<Integer> deleteDuplicates(List<Integer> nums) {

        // Check if the list is null or empty, and return an empty list if so
        if (nums == null || nums.size() == 0) {
            return new ArrayList<>(); // Return an empty list
        }

        // Implement the bigger details of your algorithm here...
        HashSet<Integer> uniqueValues = new HashSet<>();

        // Loop through the original list and add values to the HashSet
        for (Integer num : nums) {
            uniqueValues.add(num);
        }

        // Convert the HashSet back to an ArrayList
        List<Integer> sortedAndUnique = new ArrayList<>(uniqueValues);

        // Sort the resulting list
        Collections.sort(sortedAndUnique);

        // return sortedAndUnique arraylist
        return sortedAndUnique;
    }

    public static void main(String[] args) {
        // Initialize a sample sorted ArrayList with duplicate values
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(5);

        // Call the deleteDuplicates method with the sample list as argument
        List<Integer> result = deleteDuplicates(nums);

        // Print the result to the console
        System.out.println(result);
    }
}
