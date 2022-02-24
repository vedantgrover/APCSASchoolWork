package JanChallenges;

public class Divisibleby7 {
    public static void main(String[] args) {
        int[] numbers = new int[999999]; // Here is a simple integer array. I will be using this for testing.

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.floor(Math.random() * Integer.MAX_VALUE + 1);
        }

        divisibleBySeven(numbers); // This is the method call.
    }

    public static void divisibleBySeven(int[] nums) {
        /*
         * What we are doing down below is fairly simple. We are iterating
         * through each number or position in the array. Each time, we check
         * to see if the quotient of the two numbers (current array number and 7)
         * have a remainder of 0. If it does, then it prints out a line. I basically
         * have it printing out where in the array is the number and the actual number
         * itself.
         */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 7 == 0) { // If the quotient of the current array number and 7 has a remainder of 0, print
                                    // out the string below.
                System.out.println("Element " + i + " ::> " + nums[i] + " :: Answer ::> " + (nums[i] / 7)); // Should
                                                                                                            // print out
                                                                                                            // "Element
                                                                                                            // <index in
                                                                                                            // array>
                                                                                                            // ::>
                                                                                                            // <number>"
                                                                                                            // (The "<>"
                                                                                                            // are just
                                                                                                            // placeholders.
                                                                                                            // Those
                                                                                                            // will be
                                                                                                            // replaced.)
            }
        }
    }
}
