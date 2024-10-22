package _teachback._week2_loop;

public class WhileLoop { 

    public static void main(String[] args) { 
    	
        // Declare an integer variable named 'year' and initialize it to 2015
        int year = 2015;  
        
        // Start a while loop that continues as long as the 'year' variable is less than or equal to 2024
        while (year <= 2024) {  
        	
            // Print the current value of 'year' to the console
            System.out.println(year);
            
            // Increment by 2 to skip the next year
            year += 2; 
        } 
    } 
} 