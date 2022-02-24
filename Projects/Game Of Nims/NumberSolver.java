import java.util.Scanner;

public class NumberSolver {

    private Board board;
    private Player player1;
    private Player player2;

    private Player[] players;

    private int playerTurn = 0;
    private boolean playAgain = true;

    public NumberSolver() {
        player1 = new Player(0);
        player2 = new Player(1);
        board = new Board();
    }

    public NumberSolver(int numPlayers) {
        
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        String userInput;

        while (playAgain) {
            startGame();
            System.out.print("Want to play again? : ");
            userInput = sc.nextLine().toUpperCase();

            if (userInput.equals("Y") || userInput.contains("YES")) {
                playAgain = true;
            } else {
                playAgain = false;
                boolean winner = compare(player1.getScore(), player2.getScore());

                if (winner) {
                    System.out.println(player1.getName() + " is the winner! : Score >> " + player1.getScore());
                } else if (player1.getScore() == player2.getScore()) {
                    System.out.println("Both players tied. BOOORRRRIIINNNGGGG");
                } else {
                    System.out.println(player2.getName() + " is the winner! Score >> " + player2.getScore());
                }
            }

        }
    }

    public void startGame() {
        board = new Board();
        Scanner sc = new Scanner(System.in);
        while (board.currentNumber != 1) {
            // System.out.println(playerTurn);
            System.out.println(board.toString());
            if (playerTurn % 2 == player1.getId()) {
                // System.out.println(player1.getId());
                System.out.print(capatalize(player1.getName()) + ", please input your number >> ");
                int userInputtedNumber = sc.nextInt();

                if (userInputtedNumber > board.currentNumber / 2 || userInputtedNumber == 0) {
                    System.out.println("Invalid. You can only take UP TO HALF of the current number.");
                    continue;
                }

                board.subtractAmount(userInputtedNumber);
                playerTurn++;
            } else /* if (playerTurn % 2 == player2.getId()) */ {
                // System.out.println(player2.getId());
                System.out.print(capatalize(player2.getName()) + ", please input your number >> ");
                int userInputtedNumber = sc.nextInt();
                if (userInputtedNumber > board.currentNumber / 2 || userInputtedNumber == 0) {
                    System.out.println("Invalid. You can only take up to half of the current number.");
                    continue;
                }
                board.subtractAmount(userInputtedNumber);
                playerTurn++;
            }
        }

        if (playerTurn % 2 == player1.getId()) {
            System.out
                    .println(capatalize(player1.getName()) + " Lost! : " + capatalize(player2.getName()) + " Won!");
            player1.scoreUp(1);
        } else {
            System.out
                    .println(capatalize(player2.getName()) + " Lost! : " + capatalize(player1.getName()) + " Won!");
            player2.scoreUp(1);
        }
    }

    public String capatalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public boolean compare(int x, int y) {
        return x > y;
    }

}