public class IsItInArray {
    public static void main(String[] args) {
        String[][] sandyStrTwoDeeArray = { // Array should return true
            {"Sand", "sand", "sAnD"},
            {"aMpErSaNd", "sandstone", "SANDSTORM"},
            {"glissando", "thousandfold", "doesNotContainTinyEarthMolecules"},
            {"code", "codigo", "codage"}
        };

        String[][] nonSandyStrTwoDeeArray = { // Array should return false
            {"Kodierung", "python", "node.js"},
            {"ruby", "scratch", "C"},
            {"C#", "C++", "PHP"},
            {"HTML", "CSS", "javascript"}
        };

        System.out.println("Sandy Array: " + isItInArray(sandyStrTwoDeeArray, "sand"));
        System.out.println();
        System.out.println("Non-Sandy Array: " + isItInArray(nonSandyStrTwoDeeArray, "sand"));
    }

    /**
     * Checks to see if a String is located in any of the words that are in the array.
     * @param arr Array that you want to search through
     * @param str Phrase you want to search for in the array.
     * @return true if it is in array. This includes words inside other words ("sand" -> "sandwich"). false otherwise
     */
    public static boolean isItInArray(String[][] arr, String str) {
        for (String[] row : arr) {
            for (String thing : row) {
                if (thing.toLowerCase().contains(str)) {
                    return true;
                }
            }
        }

        return false;
    }
}
