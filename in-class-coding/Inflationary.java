
public class Inflationary {
    public static void main(String[] args) {
        String line1 = "One thing I don't know why";
        String line2 = "It doesn't even matter how hard I try";
        String line3 = "Keep that in mind I designed this rhyme";
        String line4 = "To explain in due time all I know";

        System.out.println(strContains(line1, "z"));
        System.out.println(strIndexOf(line2, "n"));
        System.out.println(strIndexOf(line2, "z"));

        // test your custom string methods here using the tester string lyrics above
    }

    public static boolean strContains(String input, String character) {
        for (int i = 0; i < input.length(); i++) {
            String sub = input.substring(i, i+1);
            if (sub.equals(character)) {
                return true;
            }
        }
        return false;
    }

    public static int strIndexOf(String input, String character) {
        for(int i = 0; i < input.length(); i++) {
            if(strContains(input.substring(i, i+1), character)) {
                return i;
            }
        }

        return -1;
    }

    // use for loops or while loops to create the custom string classes
    // (in increasing order of Scott-percieved difficulty)
    // strContains(a single character); returns a boolean if the character exists in the string
    // strIndexOf(a single character string); returns the index of the first place the character exists
    // strEquals(str); returns a boolean of whether the two strings are identical
    // strContainsPairs(str); a method that checks for 2 characters in a string, like "tr" or "pf" or "t?"
    // strConsecutives(str); returns a boolean if the string contains consecutive characters like "mm" or "pp"

    // HINTS
    // In general, use for loops to walk step by step through a string
    // Use substring(i,i+1) to check one character at a time.
    // how could you ensure the for loop terminates at the end of a string? is str.length() enough
    // One common practice is to use "break;" to exit out of a loop when a condition is met. 
    // A common practice is to create an int variable that exists BEFORE the loop starts and counts up 
        // each iteration. When you break, the counter is set at how many loops you did!  

}