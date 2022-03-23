public class CartesianToPolar {

    public static final double xValue = 1;
    public static final double yValue = -1;
    public static final double currentAngle = 0;
    public static boolean doTurn = true;

    public static void main(String[] args) {

        double targetAngle = convertAngle(xValue, yValue);

        System.out.println("Angle: " + targetAngle);
        System.out.println("Speed: " + convertSpeed(xValue, yValue, targetAngle));
        System.out.println("Do Turn: " + doTurn);
    }

    public static double convertAngle(double x, double y) {
        double angleInRadians = Math.atan2(x, y);

        if (angleInRadians < 0.0)
            angleInRadians += (Math.PI * 2);

        double angleInDegrees = (180.0 * angleInRadians / Math.PI);

        double error = angleInDegrees - currentAngle;

        if (error < -180) {
            error += 360;
        } else if (error > 180) {
            error -= 360;
        }

        System.out.println("Original Distance: " + error);

        if (error > 90) {
            //doTurn = (currentAngle - 180 == angleInDegrees) ? false:true;
            error -= 180;
            System.out.println("Change: -180");
        } else if (error < -90) {
            //doTurn = (currentAngle + 180 == angleInDegrees) ? false:true;
            error += 180;
            System.out.println("Change: +180");
        }

        if (error == 0) {
            doTurn = false;
        }

        System.out.println("Changed Distance to Angle: " + error);
        //System.out.println("Equiv: " + error);

        return angleInDegrees;
    }

    public static double convertSpeed(double x, double y, double targetAngle) {
        double speed = pythag(x, y);

        if (doTurn) {
            return speed;
        } else {
            return -speed;
        }

    }

    public static double pythag(double l1, double l2) {
        return Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2));
    }
}