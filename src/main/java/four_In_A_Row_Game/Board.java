package four_In_A_Row_Game;

import java.util.Stack;

public class Board {

    private int[][] grid;
    private int winCondition;
    private Stack<int[][]> history; // Stack to keep track of board states

    public Board(int winCondition) {
        this.winCondition = winCondition; // Custom win condition
        this.grid = new int[6][7]; // Assuming a default size for the board (6 rows, 7 columns)
        history = new Stack<>(); // Initialize history stack
    }

    public void initialize() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = 0; // Initialize all positions to 0 (empty)
            }
        }
    }

    public void printBoard() {
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public boolean addToken(int col, String playerNumber) {
        // Add token logic
        for (int i = grid.length - 1; i >= 0; i--) {
            if (grid[i][col] == 0) { // Check for empty spot
                history.push(copyBoardState()); // Save the current state before making a move
                grid[i][col] = Integer.parseInt(playerNumber); // Set the player's token
                return true; // Successful move
            }
        }
        return false; // Column is full
    }

    private int[][] copyBoardState() {
        int[][] copy = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            System.arraycopy(grid[i], 0, copy[i], 0, grid[i].length);
        }
        return copy;
    }

    public boolean checkIfPlayerIsTheWinner(String playerNumber) {
        // Check horizontal, vertical, and diagonal win conditions
        // Implement win condition checking logic
        return false; // Placeholder, implement actual checking
    }

    public boolean boardFull() {
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 0) return false; // Found an empty spot
            }
        }
        return true; // No empty spots
    }
}
