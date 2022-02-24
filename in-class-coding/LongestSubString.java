public class LongestSubString {
    public static void main(String[] args) {
        longestStreak("CCAAAAATTT");
    }

    public static void longestStreak(String str) {
        String longestChar = "";
        int longestCounter = 0;
        String currentChar = "";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(currentChar)) {
                counter++;
            } else {
                if (counter > longestCounter) {
                    longestCounter = counter;
                    longestChar = currentChar;
                }

                currentChar = str.substring(i, i + 1);
                counter = 0;
            }
        }

        if (counter > longestCounter) {
            longestCounter = counter;
            longestChar = str.substring(str.length() - 1);
        }

        System.out.println(longestChar + " " + (longestCounter + 1));
    }

}
