package Hangman;

import java.util.*;

public class PhraseSolver {
    // Attributes
    private String guessedLetter; // What letter did the user guess?
    private Player player1; // Player object for player 1
    private Player player2; // Player object for player 2
    private Board gameBoard; // Board object to create the game board.
    private boolean gameOver = false;

    private static int playerTurn = 0;

    public PhraseSolver() {
        player1 = new Player();
        player2 = new Player();
        gameBoard = new Board();
        // System.out.println(gameBoard.getPhrase()); // for debugging
    }

    public void play() {
        Scanner sc = new Scanner(System.in);

        while (!gameOver) {
            if (playerTurn % 2 == 0) {
                System.out.println(player1.getName() + "'s turn.");
                String userLetter = sc.nextLine();
                System.out.println(gameBoard.getLetterPointValue(userLetter));
                System.out.println(gameBoard.updateBoard(userLetter));
                player1.scoreUp(gameBoard.guessPoints);
                System.out.println("Player 1 Score : " + player1.getScore());

            } else if (playerTurn % 2 == 1) {
                System.out.println(player2.getName() + "'s turn.");
                String userLetter = sc.nextLine();
                System.out.println(gameBoard.getLetterPointValue(userLetter));
                System.out.println(gameBoard.updateBoard(userLetter));
                player2.scoreUp(gameBoard.guessPoints);
                System.out.println("Player 2 Score : " + player2.getScore());
            }

            if (gameBoard.isSolved) {
                gameOver = true;
            }
        }

        if (whichScoreIsHigher(player1.getScore(), player2.getScore())) {
            System.out.println(player1.getName() + " wins!");
        } else if (whichScoreIsHigher(player2.getScore(), player1.getScore())) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("Tied. BORING!!!!!");
        }
    }

    public boolean whichScoreIsHigher(int greater, int lower) {
        return greater > lower;
    }

    public static void skipPlayer() {
        playerTurn++;
    }

}
