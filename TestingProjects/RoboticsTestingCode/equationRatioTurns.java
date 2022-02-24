import java.util.Scanner;

public class equationRatioTurns {

    public static final double SPEED = 0.5; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please put in your turn direction.");
        String turnDir = sc.nextLine();

        System.out.println("Please put in your turn value.");
        double turn = sc.nextDouble();

        if (turnDir.toLowerCase().contains("left")) {
            System.out.println("Left Motor : " + equation(turn, SPEED));
        } else if (turnDir.toLowerCase().contains("right")) {
            System.out.println("Right Motor : " + equation(turn, SPEED));
        }
    }

    public static double equation(double turn, double currentSpeed) {
        return currentSpeed * (1 - (Math.abs(turn)));
    }

}
