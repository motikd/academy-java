import java.util.Scanner;

public class PluralForm {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an amount
        System.out.print("Enter the amount: ");
        int amt = scanner.nextInt();

        // Consume the leftover newline
        scanner.nextLine();

        // Prompt the user to enter a word
        System.out.print("Enter a singular noun: ");
        String word = scanner.nextLine();

        // Output the amount and pluralized word
        System.out.println(amt + " " + pluralize(amt, word));

        // Close the scanner
        scanner.close();
    }

    // Method to pluralize the given word based on the amount
    public static String pluralize(int amt, String word) {
        // Special rule for amt = 1, no plural form needed
        if (amt == 1) {
            return word;
        }

        // Specific case for "hippopotamus" → "hippopotami"
        if (word.equalsIgnoreCase("hippopotamus")) {
            return "hippopotami";  // Ensure we return "hippopotami"
        }

        // Handle irregular plural rules: "f" → "ves" (e.g., knife → knives)
        if (word.endsWith("fe")) {
            return word.substring(0, word.length() - 2) + "ves";
        }
        if (word.endsWith("f") && !word.endsWith("ff")) {
            return word.substring(0, word.length() - 1) + "ves";
        }

        // If word ends in "y" but not with "ay", "ey", "iy", "oy", "uy"
        if (word.endsWith("y") && !word.matches(".*[aeiou]y")) {
            return word.substring(0, word.length() - 1) + "ies";
        }

        // Add 'es' for words ending in 's', 'sh', 'ch', 'x', or 'z'
        if (word.endsWith("s") || word.endsWith("sh") || word.endsWith("ch") || word.endsWith("x") || word.endsWith("z")) {
            return word + "es";
        }

        // Default rule: Add 's' for other cases
        return word + "s";
    }

    
}
