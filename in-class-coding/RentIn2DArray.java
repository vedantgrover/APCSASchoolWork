import java.util.Arrays;

public class RentIn2DArray {
    public static void main(String[] args) {
        // Create your Array below
        int[][] rent = {
                { 700, 1100, 1575 },
                { 830, 1300, 2025 },
                { 950, 1600, 2500 },
                { 1250, 2200, 3000 }
        };
        // When you create your array, think about the following:
        // Do you need to store the titles? - No
        // Do you need to store the floor numbers? - Yes
        // How would you recall information from a specific location? - rent[row
        // #][column #]
        // What would you write to get information on one-bedrooms on the 2nd floor? -
        // rent[2][1]

        // Exercises:

        /**
         * 0) Print the contents of your array in the console using the following
         * methods:
         * a) A println statement inside a for loop, printing each row array
         * b) using Arrays.deepToString(arr) method
         * Weigh the benefits and deficits of each method
         * 
         * 1) Print the required information to the console:
         * Rent for zero-bedroom units on the 1st floor
         * Rent for two-bedroom units on the 3rd floor
         *
         * 2) Using a for loop, report the following information to the console:
         * Average rent on the 2nd floor
         * Average rent for a One_Bedroom apartment
         * 
         * 3.1) A rent increase has occurred under the following circumstances:
         * 2% per floor level, plus an additional $20 per number of bedrooms
         * Note: The additional is AFTER the % increase.
         * Note: Rounding all values down is okay
         * 
         * Using iteration, modify the array to reflect these changes. Do not
         * do the calculations yourself, let java do the math for you.
         * 
         */

        for (int i = 0; i < rent.length; i++) {
            System.out.println(Arrays.toString(rent[i]));
        }
        System.out.println(Arrays.deepToString(rent));
        /**
         * Benefits:
         * It makes it easier to look at each element in a more in-depth way. - For Loop
         * It gives you a more traditional version of printing arrays. - deepToString
         * Deficits:
         * It takes longer to type and is less efficient - For loop
         * It makes it harder to read each element due to too much going on on the
         * screen. Especially for larger 2D Arrays. - deepToString
         * 
         */

        System.out.println(rent[1][0]);
        System.out.println(rent[3][2]);

        int sum = 0;
        for (int i = 0; i < rent[2].length; i++) {
            sum += rent[2][i];
        }

        System.out.println("2nd Floor Average " + (sum/rent[2].length));

    }
}
