package a_MOTI._01_recipebook; // Package declaration to group related classes for the Recipe Book application

import java.util.List; // Importing the List interface from the java.util package to utilize list functionality
import java.util.Scanner; // Importing the Scanner class from the java.util package to handle user input

public class Main { // Declaration of the Main class, which serves as the entry point of the application
    public static void main(String[] args) { // Main method that is executed when the program starts
        RecipeBook recipeBook = new RecipeBook(); // Creating an instance of RecipeBook to manage a collection of recipes
        Scanner scanner = new Scanner(System.in); // Initializing a Scanner object to read input from the console
        boolean running = true; // A boolean flag to control the main application loop, keeping it running until the user decides to exit

        // Main loop that continues to execute until the user chooses to exit
        while (running) { 
            System.out.println(); // Print a blank line for better readability of console output
            // Print a welcome message with ANSI color formatting to enhance visibility and user experience
            System.out.println(RecipeBook.ANSI_YELLOW + "    Welcome to Recipe Book Menu " + RecipeBook.ANSI_RESET + "\n");
            // Display available menu options for the user to choose from, each option is displayed in a specific color
            System.out.println(RecipeBook.ANSI_GREEN + "1. View Recipes");
            System.out.println("2. Add Recipe");
            System.out.println("3. Delete Recipe");
            System.out.println("4. Filter Recipes by Category");
            System.out.println("5. Exit" + RecipeBook.ANSI_RESET + "\n"); // Reset color after displaying menu options
            System.out.print("Please Choose an option: "); // Prompt the user to select an option from the menu

            // Call the method to get a valid integer input from the user, ensuring it handles incorrect inputs gracefully
            int choice = getValidInteger(scanner);

            // Switch statement to handle the user's menu selection based on their input
            switch (choice) {
                case 1: // Case for viewing the list of recipes
                    recipeBook.viewRecipes(); // Call the method to display all available recipes to the user
                    // Ask the user if they want to view details of a specific recipe after listing all recipes
                    System.out.print(RecipeBook.ANSI_GREEN + "Do you want to view details of a specific recipe? (yes/no): " + RecipeBook.ANSI_RESET);
                    String viewDetailsChoice = scanner.nextLine(); // Read the user's response regarding viewing details
                    // Check if the user wants to view the details of a specific recipe, case-insensitively
                    if (viewDetailsChoice.equalsIgnoreCase("yes")) { 
                        System.out.print("Enter recipe number you want to view details: "); // Prompt the user to enter the recipe number
                        int recipeNumber = getValidInteger(scanner); // Get a valid integer input for the recipe number
                        recipeBook.viewRecipeDetails(recipeNumber - 1); // Display the details of the selected recipe, adjusting for zero-based indexing
                    }
                    break; // Exit this case after handling the user's choice

                case 2: // Case for adding a new recipe
                    // Get valid input for the recipe name from the user
                    String name = getValidRecipeName(scanner); 
                    // Get valid input for the ingredients, expecting a comma-separated format
                    List<String> ingredients = getValidIngredients(scanner); 
                    // Get valid cooking instructions from the user
                    String instructions = getValidInstructions(scanner); 
                    // Get valid input for the recipe category
                    String category = getValidCategory(scanner); 
                    Recipe newRecipe; // Declare a variable to hold the new Recipe object
                    // Use a switch statement to create the appropriate type of Recipe based on the category input
                    switch (category.toLowerCase()) { // Convert category to lower case for consistent comparison
                        case "breakfast": // If the category is breakfast
                            newRecipe = new BreakfastRecipe(name, ingredients, instructions); // Create a BreakfastRecipe object
                            break; // Exit this case
                        case "lunch": // If the category is lunch
                            newRecipe = new LunchRecipe(name, ingredients, instructions); // Create a LunchRecipe object
                            break; // Exit this case
                        case "dinner": // If the category is dinner
                            newRecipe = new DinnerRecipe(name, ingredients, instructions); // Create a DinnerRecipe object
                            break; // Exit this case
                        default: // If the category input is not recognized
                            System.out.println("Unknown category. Recipe not added."); // Inform the user that the category is invalid
                            continue; // Skip to the next iteration of the loop to allow the user to try again
                    }
                    // Add the newly created recipe to the RecipeBook
                    recipeBook.addRecipe(newRecipe); 
                    // Inform the user that the recipe was successfully added
                    System.out.println(RecipeBook.ANSI_GREEN + "Recipe added successfully!" + RecipeBook.ANSI_RESET); 
                    break; // Exit this case

                case 3: // Case for deleting a recipe from the RecipeBook
                    System.out.print("Enter recipe number to delete: "); // Prompt the user to enter the number of the recipe to delete
                    int deleteIndex = getValidInteger(scanner) - 1; // Get a valid integer input and adjust for zero-based indexing
                    // Attempt to delete the recipe at the specified index
                    boolean isDeleted = recipeBook.deleteRecipe(deleteIndex); 
                    // Check if the deletion was successful based on the returned value
                    if (isDeleted) {
                        // Notify the user that the recipe was successfully deleted
                        System.out.println(RecipeBook.ANSI_GREEN + "Recipe deleted successfully!" + RecipeBook.ANSI_RESET); 
                    } else { // If the deletion was not successful
                        // Inform the user of the error, indicating an invalid recipe number
                        System.out.println(RecipeBook.ANSI_RED + "Invalid recipe number. Deletion failed." + RecipeBook.ANSI_RESET); 
                    }
                    break; // Exit this case

                case 4: // Case for filtering recipes by a specific category
                    System.out.print("Enter category (Breakfast,Lunch,Dinner) to filter: "); // Prompt for the category to filter recipes
                    String filterCategory = scanner.nextLine(); // Read the user's category input
                    // Call the method to filter and display recipes in the specified category
                    recipeBook.filterAndDisplayRecipesByCategory(filterCategory); 
                    break; // Exit this case

                case 5: // Case for exiting the application
                    recipeBook.saveRecipes(); // Save all recipes to persistent storage before closing the application
                    // Inform the user that the application is closing
                    System.out.println(RecipeBook.ANSI_GREEN + "See you Again. Goodbye!" + RecipeBook.ANSI_RESET); 
                    running = false; // Set the running flag to false to exit the main loop
                    break; // Exit this case

                default: // If the user enters an option that is not recognized
                    // Inform the user that the option is invalid and prompt them to try again
                    System.out.println(RecipeBook.ANSI_RED + "Invalid option. Please try again." + RecipeBook.ANSI_RESET); 
            }
        }
        scanner.close(); // Close the Scanner object to free up resources and prevent memory leaks
    }

    // Method to get a valid integer input from the user
    private static int getValidInteger(Scanner scanner) {
        while (true) { // Infinite loop that continues until a valid integer is entered
            try {
                // Attempt to parse the user's input as an integer
                return Integer.parseInt(scanner.nextLine()); 
            } catch (NumberFormatException e) { // Catch the exception if the input is not a valid integer
                // Notify the user that their input was invalid and prompt them to try again
                System.out.print(RecipeBook.ANSI_RED + "Invalid input. Please enter a number: " + RecipeBook.ANSI_RESET);
            }
        }
    }

    // Method to get a valid recipe name from the user
    private static String getValidRecipeName(Scanner scanner) {
        System.out.print("Enter recipe name: "); // Prompt the user to enter a name for the recipe
        return scanner.nextLine().trim(); // Read the input, removing any leading or trailing spaces before returning
    }

    // Method to get a valid list of ingredients from the user
    private static List<String> getValidIngredients(Scanner scanner) {
        System.out.print("Enter ingredients (Please use comma when entering!): "); // Prompt for comma-separated ingredients
        // Read the input, split the string by commas, and create an array
        String[] ingredientsArray = scanner.nextLine().split(","); 
        // Convert the array to a stream, trim each ingredient of extra spaces, and collect it back into a List
        return List.of(ingredientsArray).stream() // Convert array to a stream for processing
                .map(String::trim) // Trim whitespace from each ingredient
                .toList(); // Collect the trimmed results back into a list
    }

    // Method to get valid cooking instructions from the user
    private static String getValidInstructions(Scanner scanner) {
        System.out.print("Enter cooking instructions: "); // Prompt the user to enter cooking instructions for the recipe
        return scanner.nextLine().trim(); // Read and return the input, removing extra spaces
    }

    // Method to get a valid recipe category from the user
    private static String getValidCategory(Scanner scanner) {
        String category; // Declare a variable to hold the user input for the category
        while (true) { // Loop indefinitely until a valid category is provided
            System.out.print("Choose Category From (breakfast,lunch,dinner): "); // Prompt for a valid category input
            category = scanner.nextLine().trim(); // Read the input and trim it of any extra spaces
            // Check if the entered category matches any of the valid options, case-insensitively
            if (category.equalsIgnoreCase("breakfast") || category.equalsIgnoreCase("lunch") || category.equalsIgnoreCase("dinner")) {
                return category; // If valid, return the category to the caller
            } else { // If the category is invalid
                // Notify the user that their input was invalid and specify valid options
                System.out.println(RecipeBook.ANSI_RED + "Invalid category. Please enter breakfast, lunch, or dinner." + RecipeBook.ANSI_RESET);
            }
        }
    }
}
