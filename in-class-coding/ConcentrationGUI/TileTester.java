package ConcentrationGUI;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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

    int[] randIndex = RandomPermutation.next(tileValues.length);

    int tileIndex = 0;
    for (int row = 0; row < tileArr.length; row++) {
      for (int col = 0; col < tileArr[row].length; col++) {
        tileArr[row][col] = new Tile(tileValues[randIndex[tileIndex] - 1]);
        tileIndex++;
      }
    }

    String result = "Your Array: \n\n";
    for (int row = 0; row < tileArr.length; row++) {
      for (int col = 0; col < tileArr[row].length; col++) {
        result += tileArr[row][col] + "\t";
      }
      result += "\n";
    }

    JOptionPane.showMessageDialog(null, new JTextArea(result));
  }
}
