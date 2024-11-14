package a_MOTI._01_recipebook;

import java.util.List;

// The BreakfastRecipe class extends our Recipe Sub-sclass, 
// inheriting its properties and methods while providing 
// specific implementations for breakfast recipes.
public class BreakfastRecipe extends Recipe {

    // Constructor to create a new BreakfastRecipe instance.
    // It calls the constructor of the superclass (Recipe)  to initialize name, ingredients, and instructions.
    public BreakfastRecipe(String name, List<String> ingredients, String instructions) {
        super(name, ingredients, instructions); // Calls the superclass constructor
    }

    // Implementation of the abstract method displayRecipe() from the Recipe class.
    @Override
    public void displayRecipe() {
        // So here we are accessing the name, ingredients, and instructions via the public getter methods provided by the Recipe class.
        // This demonstrates encapsulation well as the private variables in Recipe cannot be accessed directly; we use getters to retrieve their values.
        System.out.println("Breakfast Recipe: " + getName()); 
        System.out.println("Ingredients: " + String.join(", ", getIngredients())); 
        System.out.println("Instructions: " + getInstructions()); 
    }
}
