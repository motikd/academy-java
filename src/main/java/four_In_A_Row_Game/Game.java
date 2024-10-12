package four_In_A_Row_Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Game {

    private List<Player> players;
    private Board board;
    private static Scanner scanner = new Scanner(System.in);
    private ScheduledExecutorService scheduler;
    private Future<?> timerFuture;
    private static final int GAME_DURATION = 300; // Duration in seconds

    public Game(int numberOfPlayers, int winCondition) {
        this.players = new ArrayList<>(numberOfPlayers); // Initialize for multiple players
        this.board = new Board(winCondition); // Initialize the board with custom win condition
        scheduler = Executors.newScheduledThreadPool(1);
    }

    public void setUpGame() {
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Enter player " + (i + 1) + "'s name: ");
            String playerName = scanner.nextLine();
            System.out.println("Choose your token color (e.g., Red, Blue): ");
            String tokenColor = scanner.nextLine();
            players.add(new Player(playerName, String.valueOf(i + 1), tokenColor));
        }

        board.initialize(); // Set up the board
        board.printBoard(); // Print the board after setup
    }

    public void startTimer() {
        timerFuture = scheduler.schedule(() -> {
            System.out.println("Time's up! Game Over.");
            System.exit(0); // End the game when time is up
        }, GAME_DURATION, TimeUnit.SECONDS);
    }

    public void printWinner(Player player) {
        System.out.println(player.getName() + " is the winner");
    }

    public void playerTurn(Player currentPlayer) {
        try {
            int col = currentPlayer.makeMove();
            while (!board.addToken(col, currentPlayer.getPlayerNumber())) {
                System.out.println("Invalid move. Try again.");
                col = currentPlayer.makeMove();
            }
            board.printBoard(); // Show the updated board after the move
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            playerTurn(currentPlayer); // Retry the turn if an error occurs
        }
    }

    public void play() {
        startTimer(); // Start the timer at the beginning of the game
        setUpGame(); // Set up the game

        int currentPlayerIndex = 0;
        boolean noWinner = true;

        while (noWinner) {
            if (board.boardFull()) { // Check if the board is full
                System.out.println("Board is now full. Game Ends.");
                return;
            }

            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println("It is player " + currentPlayer.getPlayerNumber() + "'s turn. " + currentPlayer);
            playerTurn(currentPlayer);

            if (board.checkIfPlayerIsTheWinner(currentPlayer.getPlayerNumber())) {
                printWinner(currentPlayer);
                noWinner = false;
            } else {
                currentPlayerIndex = (currentPlayerIndex + 1) % players.size(); // Switch to the next player
            }
        }
    }
}
