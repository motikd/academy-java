package a_MOTI._01_recipebook; // Package declaration: Organizes the class into a specific namespace, making it easier to manage and find.

import java.util.List; // Imports: Allows the class to utilize the List interface, which is essential for handling lists of ingredients.

// Abstract class Recipe serves as a blueprint for different types of recipes
public abstract class Recipe {
    private String name; // Private variable to hold the name of the recipe. Private access protects this variable from being modified directly from outside the class, ensuring data integrity.
    private List<String> ingredients; // Private variable to hold a list of ingredients. This encapsulation prevents unintended changes to the ingredients list from outside the class.
    private String instructions; // Private variable to hold the cooking instructions. Making this private ensures that the instructions can only be modified through controlled methods.

    // Constructor: Initializes a new Recipe object with specific values for name, ingredients, and instructions. 
    // This constructor sets the state of the object upon creation.
    public Recipe(String name, List<String> ingredients, String instructions) {
        this.name = name; // Assign the provided name to the class variable
        this.ingredients = ingredients; // Assign the provided ingredients list to the class variable
        this.instructions = instructions; // Assign the provided instructions to the class variable
    }

    // Getter method to retrieve the name of the recipe
    public String getName() {
        return name; // Return the recipe name
    }

    // Getter method to retrieve the list of ingredients
    public List<String> getIngredients() {
        return ingredients; // Return the list of ingredients
    }

    // Getter method to retrieve the cooking instructions
    public String getInstructions() {
        return instructions; // Return the cooking instructions
    }

    // Abstract method: Declared without implementation, this method must be implemented in any non-abstract subclass.
    // This enforces a contract for subclasses to define how their specific recipe details should be displayed.
    public abstract void displayRecipe();
}
