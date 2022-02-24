public class equationRatioForTurn {
    public static void main(String[] args) {
        double[] turnValues = { 0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0 };

        double speed = 1;

        // Right Turn moving Forward.
        System.out.println("Right Turn moving Fowards!");
        for (int i = 0; i < turnValues.length; i++) {
            System.out.println("Left Motor: " + speed + " / " + turnValues[i] + " / Right Motor: "
                    + equation(turnValues[i], speed));
        }

        // Right Turn moving Backward.
        System.out.println("Right Turn moving Backwards!");
        for (int i = 0; i < turnValues.length; i++) {
            System.out.println("Left Motor: " + -speed + " / " + -turnValues[i] + " / Right Motor: "
                    + equation(turnValues[i], -speed));
        }

        // Left Turn moving forwards.
        System.out.println("Left Turn moving Forwards!");
        for (int i = 0; i < turnValues.length; i++) {
            System.out.println("Right Motor: " + speed + " / " + turnValues[i] + " / Left Motor: "
                    + equation(-turnValues[i], speed));
        }

        // Left Turn moving backwards.
        System.out.println("Left Turn moving Backwards!");
        for (int i = 0; i < turnValues.length; i++) {
            System.out.println("Right Motor: " + -speed + " / " + -turnValues[i] + " / Left Motor: "
                    + equation(-turnValues[i], -speed));
        }

    }

    public static double equation(double turn, double currentSpeed) {
        return currentSpeed * (1 - (Math.abs(turn)));
    }
}
