package _teachback._week3_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
    	
        // Scenario 1: Random Access
        // ArrayList allows quick access by index (O(1))
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);  
        nums.add(20);  
        nums.add(0, 5); 
        nums.add(30);  
        
        System.out.println("Initial ArrayList: " + nums); // Output: [5, 10, 20, 30]
        
        // Accessing elements by index
        int firstElement = nums.get(0);
        int secondElement = nums.get(1); 
        int lastElement = nums.get(nums.size() - 1); // Get last element
        
        System.out.println("First Element: " + firstElement);  
        System.out.println("Second Element: " + secondElement); 
        System.out.println("Last Element: " + lastElement);     
        
        // Scenario 2: Read-Heavy Operations
        // ArrayList is efficient for frequent reads with minimal modifications
        System.out.println("Current ArrayList: " + nums);  // Output: [5, 10, 20, 30]
        
         
        // Scenario 3: Frequent Additions at the End
        // Adding elements at the end of the list is efficient (O(1))
        nums.add(40);
        nums.add(50); 
       System.out.println("After adding elements at the end: " + nums); // Output: [5, 10, 20, 30, 40, 50]
        
        // Modifying an element by index
        nums.set(2, 25); 
       System.out.println("After set operation: " + nums); // Output: [5, 10, 25, 30, 40, 50]
        
        
    }
}
