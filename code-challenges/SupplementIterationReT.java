public class SupplementIterationReT {
    public static void main(String[] args) {
        makeMeAPrettyDiamond(9);
    }

    public static double addFrac(int numTerms) {
        double result = 0;

        for (int i = 1; i <= numTerms; i++) {
            // System.out.print("1/" + i + " + ");
            result += (1 / (double) i);
        }

        return result;
    }

    public static double twoPowerSeries(int numTerms) {
        double result = 0;

        for (int i = 1; i <= numTerms; i++) {
            // System.out.println("2^" + i + " = " + (Math.pow(2, (double) i)));
            result += (1 / (Math.pow(2, (double) i)));
        }

        return result;
    }

    /*
     * This took me too long to make. When it worked I wanted to cry. I was finally out of integration hell. 
     * It felt great. Thank you for allowing me to experience that feeling of epicness.
    */
    public static void makeMeAPrettyDiamond(int size) {
        for (int i = 0; i < size; i++) {
            for (int stars = 0; stars < (size - i) * 2; stars++) {
                System.out.print("*");
                if (stars == size - i - 1) {
                    for (int spaceInBetween = 0; spaceInBetween < (i) * 2 + 1; spaceInBetween++) {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

        for (int row = 1; row < size; row++) {
            for (int stars = 0; stars < (row + 1) * 2; stars++) {
                System.out.print("*");
                if (stars == row) {
                    for (int spaces = 0; spaces < ((size * 2) + 1) - (row + 1) * 2; spaces++) {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
