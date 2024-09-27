package _com.bptn.course.Team4; 

public class DoWhileLoop { 

    public static void main(String[] args) { 
        int i = 5; // Initialize an integer variable i with the value 5
        
        // The do block ensures that the code inside it executes at least once 
        // before checking the condition in the while statement.
        do {  
            System.out.println(i); // Print the current value of i to the console
            i++; // Increment i by 1
            
        } while (i < 10); // Continue the loop as long as i is less than 10
        
        // Once i reaches 10, the loop will stop executing.
    } 
} 