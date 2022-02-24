import java.util.Scanner;

public class NotTheSameLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;
        String input;
        String currentString = "";

        while (keepGoing) {
            System.out.print("Enter a letter: ");
            input = sc.nextLine();

            if (input.toLowerCase().equals("quit")) {
                keepGoing = false;
            } else {

                // if input is not a repeat:
                if (!(currentString.toLowerCase().contains(input.toLowerCase()))) {
                    System.out.println(currentString);
                    System.out.println("Input " + input + " accepted!");
                    currentString += input;
                } else {
                    System.out.println(currentString);
                    System.out.println("Input " + input + " has already been entered. Please try again.");
                }

                // if input is a repeat:

            }

        }
    }
}