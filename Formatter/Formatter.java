import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberSolver ns = new NumberSolver();
        Scanner sc = new Scanner(System.in);

        boolean playAgain = true;

        System.out.print("Ready to play? (Y or N) >> ");

        while (playAgain) {
            String userInput = sc.nextLine().toUpperCase();

            if ((userInput.equals("Y") || userInput.contains("YES")) && playAgain) {
                ns.play();
            } else if ((userInput.equals("N") || userInput.contains("NO")) && !playAgain) {
                System.out.println("Okay. Goodbye!");
            }

            userInput = sc.nextLine();
            if (userInput.equals("y") || userInput.contains("yes")) {
                playAgain = true;
            }

        }

        sc.close();
    }
}