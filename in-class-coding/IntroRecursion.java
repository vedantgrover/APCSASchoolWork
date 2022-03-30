public class IntroRecursion {
    public static void main(String[] args) {
        System.out.println("Here is my method:\n");
        // myMethod();
        // myMethod(1);
        // myMethod(1,10);
        // countAndAdd(1);
        // drawLine(10);
    }

    /*
     * My prediction is that this method will run until it reaches the physical
     * limitations of the computer. After it reaches that, it will error out due to
     * the computer's resources not being enough.
     */
    public static void myMethod() {
        System.out.println("Look at me go!");
        System.out.println("Aren't I great?");
        myMethod(); // ooop! what's this?
    }

    /*
     * This will do the same thing. Since there is no way of stopping this method at
     * a certain point, it will continue to run until it reaches the physical
     * limitations of the computer.
     */
    public static void myMethod(int i) {
        System.out.println("Round " + i + ": Look at me go!");
        System.out.println("Aren't I great?");
        i++;
        myMethod(i);
    }

    /*
     * Here we will have a method that runs the method until it reaches the j
     * number. It does this by only calling the method if i is not equal to j. There
     * is a way to end the recursion meaning the method does not error out.
     */
    public static void myMethod(int i, int j) {
        if (i == j) {
            System.out.println("I'm done!");
        } else {
            System.out.println("Round " + i + ": Look at me go!");
            System.out.println("Aren't I great?");
            i++;
            myMethod(i, j);
        }
    }

    /*
     * This method will keep adding a random number to i until it is greater than
     * 100
     */
    public static void countAndAdd(int i) {
        if (i > 100) {
            System.out.println(i);
        } else {
            int rand = (int) (Math.random() * 10 + 1);
            i += rand;
            System.out.println("Added " + rand + " to my sum.");
            countAndAdd(i);
        }
    }

    /*
     * This method will draw us a right angle triangle with i number of lines. The
     * bottom line will have i number of stars.
     * 
     * Putting the drawLine before the for-loop results in an inverted right angle
     * triangle.
     */
    public static void drawLine(int i) {
        if (i == 0) {
            System.out.println("LINES! ");
        } else {
            drawLine(i - 1);
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}