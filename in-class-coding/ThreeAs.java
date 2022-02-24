
/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class ThreeAs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        int aCounter = 0;
        boolean hasThreeAs = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals("a")) {
                aCounter++;
                if (aCounter == 3) {
                    hasThreeAs = true;
                }
            } else {
                aCounter = 0;
            }
        }

        if (hasThreeAs) {
            System.out.println("Your input contained three or more consecutive \"a\"s");
        } else {
            System.out.println("Your input did not contain three or more consecutive \"a\"s");
        }

    }
}