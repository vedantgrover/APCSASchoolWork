package Concentration;

/*
 * Activity 3.8.1
 */
public class TileTester {
  private static String[] tileValues = { "lion", "lion",
      "penguin", "penguin",
      "dolphin", "dolphin",
      "fox", "fox",
      "monkey", "monkey",
      "turtle", "turtle" };

  public static void main(String[] args) {

    /* your code here */
    Tile[][] tileArr = new Tile[3][4];

    int tileIndex = 0;
    for (int row = 0; row < tileArr.length; row++) {
      for (int col = 0; col < tileArr[row].length; col++) {
        tileArr[row][col] = new Tile(tileValues[tileIndex]);
        tileIndex++;
      }
    }

    for (int row = 0; row < tileArr.length; row++) {
      for (int col = 0; col < tileArr[row].length; col++) {
        System.out.print(tileArr[row][col] + "\t");
      }
      System.out.println();
    }
  }
}
