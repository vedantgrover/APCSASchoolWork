import java.util.Scanner;

public class FunkyString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Intiating Scanner Object

        System.out.print("Reversify your word! : "); // Asking user to input a String
        String str = sc.nextLine(); // Storing inputted word into variable "str"

        System.out.println(reverse(str)); // Reversifying it.

        System.out.println(everyOtherLetter(str)); // Every Other Character

    }

    // Reverses any word you put in.
    public static String reverse(String input) {
        String reverseStr = ""; // Initiating Variable for reversed variable

        for (int i = 0; i < input.length(); i++) {
            reverseStr = input.charAt(i) + reverseStr; // For loop is adding each character one at a time before each
                                                       // other.
        }

        return reverseStr; // Returning value of reverseStr so that we can print it out.
    }
    // Removes every other letter from a string
    public static String everyOtherLetter(String str) {
        String halfStr = ""; // Initializing a return variable
        // 2 Millon Pixels right here - Isha
        for (int i = 0; i < str.length(); i += 2) {
            halfStr += str.substring(i, i + 1); // Adding each letter that is in the index of i
        }
        return halfStr; // Returning initialized variable.
    }
}