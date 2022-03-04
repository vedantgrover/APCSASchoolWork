public class CartesianToPolar {

    public static final double xValue = 0.1;
    public static final double yValue = 0.7;

    public static void main(String[] args) {
        System.out.println("Angle: " + convertAngle(xValue, yValue));
        System.out.println("Speed: " + convertSpeed(xValue, yValue));
    }

    public static double convertAngle(double x, double y) {
        double angleInRadians = Math.atan2(x, y);

        if (angleInRadians < 0.0)
            angleInRadians += (Math.PI * 2);

        double angleInDegrees = (180.0 * angleInRadians / Math.PI);

        return angleInDegrees;
    }

    public static double convertSpeed(double x, double y) {
        return pythag(x, y);
    }

    public static double pythag(double l1, double l2) {
        return Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2));
    }
}