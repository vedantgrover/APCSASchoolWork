public class CartesianToPolar {

    public static final double xValue = 0.5;
    public static final double yValue = -0.2;

    public static void main(String[] args) {
        System.out.println(convert(xValue, yValue));
    }

    public static double convert(double x, double y) {
        double angleInRadians = Math.atan2(x, y);

        if (angleInRadians < 0.0)
            angleInRadians += (Math.PI * 2);

        double angleInDegrees = (180.0 * angleInRadians / Math.PI);

        return angleInDegrees;
    }
}