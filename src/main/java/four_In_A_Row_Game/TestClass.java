package four_In_A_Row_Game;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of players (2-4): ");
        int numberOfPlayers = scanner.nextInt();

        System.out.println("Enter win condition (e.g., 4, 5): ");
        int winCondition = scanner.nextInt();

        Game fourInARowGame = new Game(numberOfPlayers, winCondition); // Create game instance
        fourInARowGame.play(); // Start the game
    }
}
