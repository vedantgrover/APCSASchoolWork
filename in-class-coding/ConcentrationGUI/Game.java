package ConcentrationGUI;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/** 
 * The game that uses a n x m board of tiles or cards.
 *  
 * Player chooses two random tiles from the board. The chosen tiles
 * are temporarily shown face up. If the tiles match, they are removed from board.
 * 
 * Play continues, matching two tiles at a time, until all tles have been matched.
*/
import java.util.Scanner;

/**
 * A game class to play concentration
 */
public class Game {
  private Scanner in = new Scanner(System.in);

  private Board board;
  private int row1, col1;
  private int row2, col2;

  public void play() {
    // instructions
    JOptionPane.showConfirmDialog(null,
        "Select the tile locations you want to match,\nor enter any non-integer character to quit.\n(You will need to know 2D arrays to play!)\n\nReady?",
        "Welcome!", 2);

    board = new Board();
    // play until all tiles are matched
    while (!board.allTilesMatch()) {
      // get player's first selection, if not an integer, quit
      row1 = -1;
      col1 = -1;
      boolean validTile = false;
      while (!validTile) {
        JOptionPane.showMessageDialog(null, new JTextArea("Current Game:\n\n" + board.toString()));
        validTile = getTile(true);
      }

      // display first tile
      board.showValue(row1, col1);

      // get player's second selection, if not an integer, quit
      row2 = -1;
      col2 = -1;
      validTile = false;
      while (!validTile) {
        JOptionPane.showMessageDialog(null, new JTextArea("Current Game:\n\n" + board.toString()));
        validTile = getTile(false);

        // check if user chosen same tile twice
        if ((row1 == row2) && (col1 == col2)) {
          JOptionPane.showMessageDialog(null, "You mush choose a different second tile");
          //wait(2);
          validTile = false;
        }
      }

      // display second tile
      board.showValue(row2, col2);
      JOptionPane.showMessageDialog(null, new JTextArea("Current Game:\n\n" + board.toString()));

      // determine if tiles match
      String matched = board.checkForMatch(row1, col1, row2, col2);
      JOptionPane.showMessageDialog(null, matched);

      // wait 2 seconds to start the next turn
      //wait(2);
    }

    JOptionPane.showMessageDialog(null, new JTextArea("Current Game:\n\n" + board.toString()));
    System.out.println("Game Over!");
  }

  /**
   * Get tile choices from the user, validating that
   * the choice falls within the range of rows and columns on the board.
   * 
   * @param firstChoice if true, saves the user's first row/col choice, otherwise
   *                    sets the user's second choice
   * @return true if user has made a valid choice, false otherwise
   */

  private boolean getTile(boolean firstChoice) {
    int num1 = 0;
    int num2 = 0;

    String[] userResponse = JOptionPane.showInputDialog(null, "Your choice (row col)").split(" ");

    if (userResponse.length == 2) {
      num1 = Integer.parseInt(userResponse[0]);
      num2 = Integer.parseInt(userResponse[1]);
    } else
      quitGame();

    in.reset(); // ignore any extra input

    if (!board.validateSelection(num1, num2)) {
      JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
      // wait(2);
      return false;
    }
    if (firstChoice) {
      row1 = num1;
      col1 = num2;
    } else {
      row2 = num1;
      col2 = num2;
    }
    return true;
  }

  /**
   * Wait n seconds before clearing the console
   */
  private void wait(int n) {
    // a try is like an if statement, "throwing" an error if the body of the try
    // fails
    try {
      Thread.sleep(n * 1000);
    } catch (InterruptedException e) {
      /* do nothing */ }
  }

  /**
   * User quits game
   */
  private void quitGame() {
    JOptionPane.showMessageDialog(null, "Quit Game!", "Don't Die", -1);
    System.exit(0);
  }
}
