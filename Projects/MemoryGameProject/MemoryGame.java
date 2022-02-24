import java.util.Arrays;

/**
 * Project 3.6.5
 *
 * The Memory Game shows a random sequence of "memory strings" in a variety of
 * buttons.
 * After wathcing the memory strings appear in the buttons one at a time, the
 * player recreates the sequence from memory.
 */
public class MemoryGame {

  public static final double delay = 0.5;

  public static void main(String[] args) {

    int score = 0;
    int numGames = 0;
    MemoryGameGUI frame = new MemoryGameGUI();

    int arraySize = frame.getAlphabetCount();

    // Create an array of single character strings that the game will randomize
    // to create an order for the player to memorize and recall. This is just an
    // array of your possible characters.

    String[] singChar = new String[arraySize];

    singChar[0] = "a";
    int value = singChar[0].charAt(0);
    for (int i = 1; i < singChar.length; i++) {
      singChar[i] = String.valueOf((char) (value + i));
    }
    //System.out.println(Arrays.toString(possibleChar));

    //String[] singChar = { "a", "b", "c", "d", "e"/*
                                                  // * , "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                                                  // * "s", "t", "u", "v", "w", "x", "y", "z"
                                                  // */ };

    // Create the game and gameboard. Configure a randomized board with 3 buttons.
    // (Later, you can change options to configure more or less buttons
    // and turn randomization on or off.) Be sure to scan through the GUI class
    // file to learn how to construct the game and gameboard.

    frame.createBoard(3, true);

    // Play the game until user wants to quit.
    boolean keepPlaying = true;
    while (keepPlaying) {
      // Create a new array that will contain the randomly ordered memory strings.
      String[] randStr = new String[singChar.length];
      // Create a list of randomly ordered integers with no repeats, the length
      // of memory strings. Use it to create a random sequence of the memory strings.
      // - OR -
      // Overload the next method in RandomPermutation to create a random sequence
      // of the memory strings, passed as a parameter.

      int[] randInts = next(singChar.length);

      for (int i = 0; i < singChar.length; i++) {
        randStr[i] = singChar[randInts[i] - 1];
      }
      // System.out.println(Arrays.toString(randStr));
      // Play one sequence, delaying half a second for the strings to show
      // in the buttons. Save the player"s guess.
      // (Later, you can speed up or slow down the game.)
      // Determine if player"s guess matches all elements of the random sequence.

      // Cleanup the guess - remove commas and spaces. Refer to a new String method
      // replace to make this easy.
      String playerGuess = removeCommaAndSpace(frame.playSequence(randStr, delay));

      // iterate to determine if guess matches sequence
      boolean match = isMatched(randStr, playerGuess);
      // If match, increase score, and signal a match, otherwise, try again.
      while (!match) {
        frame.tryAgain();
        playerGuess = removeCommaAndSpace(frame.playSequence(randStr, delay));
        match = isMatched(randStr, playerGuess);
      }

      if (match) {
        score++;
        frame.matched();
      }

      // Ask if user wants to play another round of the game
      // and track the number of games played.
      keepPlaying = frame.playAgain();
      numGames++;
    }

    // When done playing, show score and end the game.
    frame.showScore(score, numGames);
    frame.quit();
  }

  public static int[] next(int maxVal) {
    int[] nums = new int[maxVal];
    int[] randomNums = new int[nums.length];
    int maxValue = nums.length - 1;
    nums[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      nums[i] = nums[i - 1] + 1;
    }

    for (int i = 0; i < nums.length; i++) {
      int rand = (int) (Math.random() * maxValue);
      randomNums[i] = nums[rand];
      nums[rand] = nums[maxValue];
      maxValue--;
    }
    System.out.println("Int Arary: " + Arrays.toString(randomNums));
    return randomNums;
  }

  public static boolean isMatched(String[] strArr, String playerGuess) {
    boolean match = false;
    for (int i = 0; i < strArr.length; i++) {
      if (strArr.length != playerGuess.length()) {
        return false;
      } else {
        if (strArr[i].equals(playerGuess.substring(i, i + 1))) {
          match = true;
        } else {
          match = false;
        }
      }
    }

    return match;
  }

  public static String removeCommaAndSpace(String str) {
    str.replace(",", "");
    str.replace(" ", "");

    return str;
  }
}