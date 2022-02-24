import java.util.Scanner;

public class RocketShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of Rocket : ");
        String rocketName = sc.nextLine();
        System.out.print("Proportional Size : ");
        final int size = sc.nextInt(); // Proportional Size.
        System.out.println("\nRocket : " + rocketName + "\n");
        cone(size);
        divider(size);
        topHalfBody(size);
        bottomHalfBody(size);
        divider(size);
        bottomHalfBody(size);
        topHalfBody(size);
        divider(size);
        cone(size);

    }

    // This will be the top and the bottom of the rocket.
    public static void cone(int height) {
        int finalHeight = height * 2; // Finding the total amount of lines the cone will be.
        for (int i = 1; i < finalHeight; i++) {
            System.out.print(" "); // Beginning space in the rocket cone. (Formatting)
            for (int spaces = 1; spaces <= finalHeight - i; spaces++) {
                System.out.print(" "); // Inversing the triangle and filling in the space to format the triangle in a
                                       // cone shape. (Formatting)
            }
            for (int j = 0; j < i; j++) {
                System.out.print("/"); // Making the "/" marks for the cone. (Design)
            }
            System.out.print("**"); // Star vertical divider. (Design)
            for (int k = 0; k < i; k++) {
                System.out.print("\\"); // Otherside of the cone with the "\".
            }
            System.out.println(" "); // Goes to the next line.
        }
    }

    // The divider in between the different sections of the rocket.
    public static void divider(int size) {
        System.out.print(" +"); // The starting "+" symbol in te divider. "+=*=*=*..." (Design and Formatting)
        for (int symbols = 0; symbols < size * 2; symbols++) {
            System.out.print("=*"); // Filler for the divider (Design)
        }
        System.out.println("+"); // Last plus sign to end of divider. Also goes to next line after it is done.
                                 // "...=*=*=*+" (Design and Formatting)
    }

    // The top half of the body of the rocket.
    public static void topHalfBody(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" |"); // Starting of the pattern "|..../\.." (Formatting and Design)
            for (int j = 0; j < 2; j++) {
                for (int dotStuff = 1; dotStuff < size - i; dotStuff++) {
                    System.out.print("."); // Making the dots for the pattern (Design).
                }

                for (int slashes = 0; slashes <= i; slashes++) {
                    System.out.print("/\\"); // This is the triangle that is making the triangle.
                }

                for (int dotStuff = 1; dotStuff < size - i; dotStuff++) {
                    System.out.print("."); // Filler Dots
                }
            }

            System.out.println("|"); // Final "|" to end off the pattern.

        }
    }

    // The bottom half of the body of the rocket.
    public static void bottomHalfBody(int size) {
        for (int i = size; i >= 1; i--) {
            System.out.print(" |");
            for (int j = 1; j <= 2; j++) {
                for (int dots = 1; dots <= size - i; dots++) {
                    System.out.print(".");
                }
                for (int slashes = 1; slashes <= i; slashes++) {
                    System.out.print("\\/");
                }
                for (int dots = 1; dots <= size - i; dots++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
}
