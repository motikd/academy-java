package a_MOTI._01_recipebook; // Package declaration organizes the class into a specific namespace

import static org.junit.jupiter.api.Assertions.assertEquals; // Importing static assertion methods for testing, allowing for easy comparison of expected and actual values

import java.util.ArrayList; // Importing ArrayList to create a dynamic list of ingredients
import java.util.List; // Importing List interface for type flexibility and ease of use

import org.junit.jupiter.api.Test; // Importing JUnit Test annotation to denote methods that are test cases

// RecipeBookTest class is used to test the functionality of the Recipe classes, specifically BreakfastRecipe
public class RecipeBookTest {

    // Test method to verify the creation of a BreakfastRecipe
    @Test
    void testCreateBreakfastRecipe() {
        // Creating a list to hold ingredients for the recipe
        List<String> ingredients = new ArrayList<>(); // Using ArrayList for a mutable list
        ingredients.add("Flour"); // Adding ingredients to the list
        ingredients.add("Milk");
        ingredients.add("Eggs");
        ingredients.add("Sugar");

        // Creating an instance of BreakfastRecipe with the name, ingredients, and instructions
        BreakfastRecipe recipe = new BreakfastRecipe("Pancakes", ingredients, "Mix ingredients and cook on a griddle.");

        // Validate that the recipe's attributes are correctly set using assertions
        assertEquals("Pancakes", recipe.getName(), "Recipe name should be 'Pancakes'"); // Asserting that the recipe name matches the expected value
        assertEquals(ingredients, recipe.getIngredients(), "Ingredients should match the provided list"); // Asserting that the ingredients list matches the expected list
        assertEquals("Mix ingredients and cook on a griddle.", recipe.getInstructions(), "Instructions should match the provided instructions"); // Asserting that the cooking instructions match the expected value
    }

    // Test method to verify the getName functionality, intentionally testing an incorrect case
    @Test
    void testGetRecipeName() {
        // Create a list of ingredients for a recipe
        List<String> ingredients = List.of("Flour", "Milk", "Eggs", "Sugar"); // Using List.of for a fixed-size list, easier for read-only access

        // Create a BreakfastRecipe with a different name
        BreakfastRecipe recipe = new BreakfastRecipe("English Cake", ingredients, "Mix ingredients and cook on a griddle.");

        // Verify that the getName method returns the correct recipe name
        // This assertion is intentionally set to fail to demonstrate how unit testing can confirm incorrect setups
        // Here we are asserting that the name should be "Pancakes", which is incorrect because we created the recipe with the name "English Cake"
        assertEquals("Pancakes", recipe.getName(), "Recipe name should be 'Pancakes'"); // This will fail since the actual name is "English Cake"

        // Failing tests are useful as they help identify areas in the code where expectations do not match reality.
        // In this case, it shows that the name "Pancakes" is not the same as "English Cake", which alerts the developer to revisit the recipe creation logic.
    }
}
