import java.util.Arrays;

public class ReplaceWithZero {
    public static void main(String[] args) {
      int[][] twoDeeArray = { // Testing Array
          {1, 5, 4, 6, 8, 4, 0},
          {-2, 0, -6, 7, -3, 8, 9},
          {2, 3, -1, 6, 7, -2, 9},
          {6, 7, 5, -8, 3, 0, -4}
      };

      System.out.println("Ordinary Array: " + Arrays.deepToString(twoDeeArray)); // Visual of Ordinary non-adjusted array
      System.out.println();
      System.out.println("Adjusted Array: " + Arrays.deepToString(replaceWithZero(twoDeeArray))); // Putting the array through the method and printing it
    }

    /**
     * Goes through all elements of an array and replaces all negative digits with 0
     * @param arr The 2D Array that you are traversing through
     * @return The modified array with all negative values being 0
     */
    public static int[][] replaceWithZero(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] < 0) {
                    arr[row][col] = 0;
                }
            }
        }

        return arr;
    }
}
