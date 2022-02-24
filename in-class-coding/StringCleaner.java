public class StringCleaner {
    public static void main(String[] args) {
        String str = "It was a bright cold day in April, and the clocks were striking thirteen. Winston Smith, his chin nuzzled into his breast in an effort to escape the vile wind, slipped quickly through the glass doors of Victory Mansions, though not quickly enough to prevent a swirl of gritty dust from entering along with him.";

        System.out.println(removePunctuation(str));
    }

    public static String removePunctuation(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)) || Character.isSpaceChar(str.charAt(i))) {
                newStr+=str.charAt(i);
            }
        }

        return newStr;
    }

}
