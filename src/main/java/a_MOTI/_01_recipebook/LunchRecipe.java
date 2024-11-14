package a_MOTI._01_recipebook; // Package declaration organizes classes into a namespace

import java.util.List; // Import List interface for managing lists of ingredients

// LunchRecipe class is a subclass of Recipe, representing a specific type of recipe
public class LunchRecipe extends Recipe {

    // Constructor to create a LunchRecipe object
    public LunchRecipe(String name, List<String> ingredients, String instructions) {
        // Calls the constructor of the superclass (Recipe) to initialize the name, ingredients, and instructions
        super(name, ingredients, instructions);
    }

    // The @Override annotation indicates that this method is intended to override a method in the superclass (Recipe)
    // This ensures that the method signature matches the one in the superclass, which helps prevent errors
    @Override
    public void displayRecipe() {
        // Prints the recipe type along with its name
        System.out.println("Lunch Recipe: " + getName());
        
        // Prints the list of ingredients joined by a comma
        System.out.println("Ingredients: " + String.join(", ", getIngredients()));
        
        // Prints the cooking instructions for the recipe
        System.out.println("Instructions: " + getInstructions());
    }
}
