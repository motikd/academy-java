package a_MOTI._01_recipebook; // Declare the package name, organizing the code structure

import java.io.IOException; // Import IOException for error handling during file operations
import java.nio.file.Files; // Import Files class for file manipulation, allowing reading and writing to files
import java.nio.file.Path; // Import Path class to represent file paths within the file system
import java.nio.file.Paths; // Import Paths class for creating Path instances conveniently
import java.nio.file.StandardOpenOption; // Import for specifying how files should be opened (e.g., creating, truncating)
import java.util.ArrayList; // Import ArrayList class to utilize dynamic array capabilities for storing recipes
import java.util.List; // Import List interface to define lists that hold recipe objects
import java.util.stream.Collectors; // Import Collectors for stream operations to transform collections

public class RecipeBook {
    private List<Recipe> recipes; // List to hold all the recipes in the recipe book, enabling dynamic management
    private final String fileName = "Recipes.txt"; // Filename used for storing and retrieving recipes from the file system

    // ANSI color codes for formatting terminal output
    public static final String ANSI_GREEN = "\u001B[32m"; // Green color used for success messages in console
    public static final String ANSI_YELLOW = "\u001B[33m"; // Yellow color used for headers and informative messages
    public static final String ANSI_RESET = "\u001B[0m"; // ANSI code to reset color to the default terminal color
    public static final String ANSI_RED = "\u001B[31m"; // Red color used for error messages to alert users

    // Constructor to initialize the RecipeBook object and load existing recipes from a text file
    public RecipeBook() {
        recipes = new ArrayList<>(); // Instantiate the recipes list as an empty ArrayList to hold Recipe objects
        loadRecipes(); // Invoke loadRecipes method to read existing recipes from the specified file upon creation
    }

    // Method to add a new recipe to the recipe book
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe); // Add the provided Recipe object to the internal list of recipes
    }

    // Method to retrieve all recipes, primarily for testing purposes (to verify that recipes are stored correctly)
    public List<Recipe> getRecipes() { 
        return recipes; // Return the current list of Recipe objects
    }

    // Method to display all recipes in a formatted table
    public void viewRecipes() {
        // Print the header for the recipe list with formatted column names
        System.out.printf(ANSI_YELLOW + "%-5s | %-25s | %-15s | %-40s%n" + ANSI_RESET, 
                          "Num", "Recipe Name", "Category", "Description");
        // Print a separator line for better readability of the output
        System.out.println("=========================================================================================");

        // Iterate over each recipe and display its details in a structured format
        for (int i = 0; i < recipes.size(); i++) {
            Recipe recipe = recipes.get(i); // Retrieve the Recipe object at the current index
            // Extract the category by removing "Recipe" from the class name (e.g., BreakfastRecipe -> Breakfast)
            String category = recipe.getClass().getSimpleName().replace("Recipe", "");
            // Print the recipe details in a tabulated format
            System.out.printf("%-5d | %-25s | %-15s | %-40s%n", 
                              (i + 1), recipe.getName(), category, String.join(", ", recipe.getIngredients()));
        }
        // Print a footer line for the recipe list to indicate the end of the display
        System.out.println("=========================================================================================");
    }

    // Method to view details of a specific recipe by its index in the list
    public void viewRecipeDetails(int recipeIndex) {
        // Validate the provided index to ensure it is within the bounds of the recipes list
        if (recipeIndex >= 0 && recipeIndex < recipes.size()) {
            Recipe recipe = recipes.get(recipeIndex); // Retrieve the specified Recipe object
            recipe.displayRecipe(); // Call the displayRecipe method on the Recipe object to show its detailed information
        } else {
            // Handle invalid index by printing an error message
            System.out.println("\n" + ANSI_RED + "Invalid recipe number. Please try again." + ANSI_RESET);
        }
    }

    // Method to delete a recipe by its index in the list
    public boolean deleteRecipe(int index) {
        // Validate the provided index to ensure it is within the bounds of the recipes list
        if (index >= 0 && index < recipes.size()) {
            recipes.remove(index); // Remove the Recipe object at the specified index from the list
            return true; // Return true indicating that the deletion was successful
        } else {
            return false; // Return false indicating that the provided index was invalid
        }
    }

    // Method to filter recipes by category and display them
    public void filterAndDisplayRecipesByCategory(String category) {
        // Use Java streams to filter recipes based on the specified category
        List<Recipe> filteredRecipes = recipes.stream()
                .filter(recipe -> recipe.getClass().getSimpleName().equalsIgnoreCase(category + "Recipe")) // Compare class name with category
                .collect(Collectors.toList()); // Collect the filtered results into a new list

        // Check if any recipes were found in the specified category
        if (filteredRecipes.isEmpty()) {
            // Handle the case where no recipes match the specified category
            System.out.println(ANSI_GREEN + "No recipes found for category: " + category + ANSI_RESET);
        } else {
            // Print a header indicating the category of the displayed recipes
            System.out.printf(ANSI_YELLOW + "Recipes in category: %s%n" + ANSI_RESET, category);
            // Iterate over and display each filtered recipe
            for (Recipe recipe : filteredRecipes) {
                recipe.displayRecipe(); // Call the displayRecipe method for each Recipe object to show details
                System.out.println(); // Add a newline for improved formatting
            }
        }
    }

    // Method to load recipes from a text file into the recipes list
    public void loadRecipes() {
        recipes.clear(); // Clear any existing recipes from the list to ensure fresh loading
        Path filePath = Paths.get(fileName); // Create a Path object representing the recipes file's location
        try {
            List<String> lines = Files.readAllLines(filePath); // Read all lines from the specified file into a list
            // Process each line in the file to extract recipe data
            for (String line : lines) {
                // Split each line into parts based on the semicolon delimiter, limiting to 4 parts
                String[] parts = line.split(";", 4); 

                // Ensure there are exactly 4 parts to prevent errors in processing
                if (parts.length == 4) { 
                    String name = parts[0]; // Extract the recipe name from the first part
                    List<String> ingredients = List.of(parts[1].split(",")); // Split ingredients by comma and convert to a List
                    String instructions = parts[2]; // Extract cooking instructions from the third part
                    String category = parts[3]; // Extract the recipe category from the fourth part

                    Recipe recipe; // Declare a Recipe variable to hold the created recipe
                    // Determine the recipe type based on the category
                    switch (category.toLowerCase()) {
                        case "breakfast":
                            recipe = new BreakfastRecipe(name, ingredients, instructions); // Create an instance of BreakfastRecipe
                            break;
                        case "lunch":
                            recipe = new LunchRecipe(name, ingredients, instructions); // Create an instance of LunchRecipe
                            break;
                        case "dinner":
                            recipe = new DinnerRecipe(name, ingredients, instructions); // Create an instance of DinnerRecipe
                            break;
                        default:
                            // Handle the case of an unknown category by skipping this recipe and printing a warning
                            System.out.println("Unknown category. Skipping recipe: " + name);
                            continue; // Skip to the next iteration of the loop to avoid processing the invalid entry
                    }
                    // Add the created Recipe object to the recipe book's list
                    addRecipe(recipe); 
                } else {
                    // Handle invalid entries that do not conform to the expected format
                    System.out.println("Skipping invalid recipe entry in the file: " + line);
                }
            }
        } catch (IOException e) {
            // Handle any IO errors that may occur during file reading and display an error message
            System.out.println(ANSI_RED + "Error loading recipes: " + ANSI_RESET + e.getMessage());
        }
    }

    // Method to save all recipes to a text file for persistence
    public void saveRecipes() {
        Path filePath = Paths.get(fileName); // Create a Path object representing the recipes file's location
        try {
            // Convert the list of recipes to a suitable format for file writing
            List<String> lines = recipes.stream()
                    .map(recipe -> recipe.getName() + ";" + // Get the recipe name
                            String.join(",", recipe.getIngredients()) + ";" + // Get ingredients as a comma-separated string
                            recipe.getInstructions() + ";" + // Get cooking instructions
                            recipe.getClass().getSimpleName().replace("Recipe", "")) // Get the category by removing "Recipe" from the class name
                    .collect(Collectors.toList()); // Collect the formatted strings into a new list
            
            // Write the collected lines to the specified file, creating or truncating it as necessary
            Files.write(filePath, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            // Print a success message indicating the recipes were saved successfully
            System.out.println(ANSI_GREEN + "Recipes saved successfully." + ANSI_RESET);
        } catch (IOException e) {
            // Handle any IO errors that may occur during file writing and display an error message
            System.out.println(ANSI_RED + "Error saving recipes: " + e.getMessage() + ANSI_RESET);
        }
    }
}
