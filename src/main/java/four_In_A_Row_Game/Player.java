package four_In_A_Row_Game;

import java.util.Scanner;

public class Player {

    private String name;
    private String playerNumber;
    private String tokenColor;
    private static Scanner scanner = new Scanner(System.in);

    public Player(String name, String playerNumber, String tokenColor) {
        this.name = name;
        this.playerNumber = playerNumber;
        this.tokenColor = tokenColor;
    }

    public String getName() {
        return name;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public String getTokenColor() {
        return tokenColor;
    }

    public int makeMove() {
        System.out.println("Make your move. What column do you want to put a token in?");
        return scanner.nextInt(); // Receive user input
    }

    public String toString() {
        return "Player " + playerNumber + " is " + name + " with color " + tokenColor;
    }
}
