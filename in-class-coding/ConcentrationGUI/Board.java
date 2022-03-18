package ConcentrationGUI;

/** 
 * A game board of NxM board of tiles.
 */

/**
 * A Board class for concentration
 */
public class Board {

  private static String[] tileValues = { "lion", "lion",
      "penguin", "penguin",
      "dolphin", "dolphin",
      "fox", "fox",
      "monkey", "monkey",
      "turtle", "turtle" };
  private Tile[][] gameboard = new Tile[3][4];

  public Board() {
    int[] randIndex = RandomPermutation.next(tileValues.length);

    int tileIndex = 0;
    for (int row = 0; row < gameboard.length; row++) {
      for (int col = 0; col < gameboard[row].length; col++) {
        gameboard[row][col] = new Tile(tileValues[randIndex[tileIndex] - 1]);
        tileIndex++;
      }
    }
  }

  /**
   * Checks to see if all tiles have been matched.
   * 
   * @return true if all tiles matched status = true
   */
  public boolean allTilesMatch() {
    for (Tile[] row : gameboard) {
      for (Tile t : row) {
        if (!t.matched()) {
          return false;
        }
      }
    }

    return true;
  }

  /**
   * Sets the tile to show its value (like turning the card face-up)
   * 
   * @param row
   * @param col
   */
  public void showValue(int row, int col) {
    gameboard[row][col].show();
  }

  /**
   * Check if the Tiles in the two locations match.
   * 
   * If match: show Tiles in matched state and return a 'matched' message
   * 
   * @param row1
   * @param col1
   * @param row2
   * @param col2
   * @return a message declaring a match or no match
   */
  public String checkForMatch(int row1, int col1, int row2, int col2) {
    if (gameboard[row1][col1].getValue().equals(gameboard[row2][col2].getValue())) {
      gameboard[row1][col1].show();
      gameboard[row2][col2].show();
      gameboard[row1][col1].foundMatch();
      gameboard[row2][col2].foundMatch();
      return "Matched!";
    } else {
      gameboard[row1][col1].hide();
      gameboard[row2][col2].hide();
      return "No Match!";
    }
  }

  /**
   * Checks the inputs to make sure they fall within the gameboard dimensions
   * 
   * @param row
   * @param col
   * @return true if valid input
   */
  public boolean validateSelection(int row, int col) {

    if (gameboard[row][col].isShowingValue() || gameboard[row][col].matched()) {
      return false;
    }

    if (row >= gameboard.length)
      return false;
    if (col >= gameboard[0].length)
      return false;

    if (gameboard[row][col] == null) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * Gets a string that represents the board in it's current state
   * 
   * @return 3x4 arranged String of current gameboard
   */
  /**
   * Gets a string that represents the board in it's current state
   * 
   * @return 3x4 arranged String of current gameboard
   */
  public String toString() {
    String result = "";

    int currentRow = 0;
    result += "\t=~0~=\t=~1~=\t=~2~=\t=~3~=\n";
    for (Tile[] row : gameboard) {
      result += "=~" + currentRow + "~=\t";
      for (Tile t : row) {
        if (t.matched() || t.isShowingValue()) {
          result += t.getValue() + "\t";
        } else
          result += t.getHidden() + "\t";
      }
      currentRow++;
      result += "\n";
    }

    return result;
  }

}
