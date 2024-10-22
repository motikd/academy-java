package com.bptn.course._34_sorting_algorithms;



public class GenericsDemo {

    // Generic method to find the maximum of two numbers using ternary operator
    public static <T extends Comparable<T>> T findMaxGeneric(T num1, T num2) {
        return (num1.compareTo(num2) > 0) ? num1 : num2;  // Ternary operator
    }

    public static void main(String[] args) {
        // Example usage with different types
        System.out.println("Maximum between 10 and 20: " + findMaxGeneric(10, 20));
        System.out.println("Maximum between 10.5 and 5.8: " + findMaxGeneric(10.5, 5.8));
        System.out.println("Maximum between 'apple' and 'orange': " + findMaxGeneric("apple", "orange"));
    }
}
