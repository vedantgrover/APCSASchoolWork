package Concentration;

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
    int tileIndex = 0;
    for (int row = 0; row < gameboard.length; row++) {
      for (int col = 0; col < gameboard[row].length; col++) {
        gameboard[row][col] = new Tile(tileValues[tileIndex]);
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

  public void showValue(int row, int col) {
    gameboard[row][col].show();
  }

  public String checkForMatch(int row1, int col1, int row2, int col2) {
    if (gameboard[row1][col1].getValue().equals(gameboard[row2][col2].getValue())) {
      return "Matched!";
    } else {
      return "No Match!";
    }
  }

  public boolean validateSelection(int row, int col) {

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

  public String toString() {
    String result = "";

    for (Tile[] row : gameboard) {
      for (Tile t : row) {
        if (t.matched()) {
          result += t.getValue();
        } else if (t.isShowingValue())  {
          result += t.getValue();
        } else result += t.getHidden();
      }
    }

    return result;
  }

}
