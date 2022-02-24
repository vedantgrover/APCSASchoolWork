public class makeMeAPrettyPicture {
    public static void main(String[] args) {
        System.out.println(makeMeAPrettyPicture(6));
    }

    /**
     * Name: Vedant Grover
     * Date: 12/26/21
     * Supplement "makeMeAPrettyPicture"
     */

    public static String makeMeAPrettyPicture(int size) {
        String result = ""; // Final Result
        int sym = 0; // Decides the starting symbol.
        for (int i = 0; i < size; i++) {
            String tempResult = ""; // Builds a full line in a temprorary String before adding to final result
            // Starting Symbol
            if (sym % 2 == 0) { // If true print "$"
                tempResult += "$";
            } else { // If false print "*"
                tempResult += "^";
            }

            for (int spaces = i; spaces > 0; spaces--) { // Controls the spaces before the stars start.
                tempResult += " ";
            }

            for (int stars = 0; stars < size - i; stars++) { // Controls the stars after the spaces.
                tempResult += "*";
            }

            tempResult += "||XX||\n"; // Prints out the common pattern after all the spaces and stars.
            result += tempResult; // Addes temporary result (line) to final result.
            sym++; // Switches the starting symbol.
        }

        return result;
    }
}