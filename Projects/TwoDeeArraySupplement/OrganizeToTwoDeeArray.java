import java.util.Arrays;

public class OrganizeToTwoDeeArray {
    public static void main(String[] args) {
        // Test Arrays
        int[] test1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] test2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] test3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int[] test4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] test5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

        System.out.println(Arrays.deepToString(organize(test1)));
        System.out.println();
        System.out.println(Arrays.deepToString(organize(test2)));
        System.out.println();
        System.out.println(Arrays.deepToString(organize(test3)));
        System.out.println();
        System.out.println(Arrays.deepToString(organize(test4)));
        System.out.println();
        System.out.println(Arrays.deepToString(organize(test5)));

    }

    /**
     * Organizes a 1D Array into an almost even 2D Array
     * @param nums 1D Array you want to convert
     * @return An even 2D array that consists of the elements from the 1D Array
     */
    public static int[][] organize(int[] nums) {
        int n = (int) Math.sqrt(nums.length);
        int m = (int) (nums.length / n);

        if (isPrime(nums.length)) {
            int[][] result = { nums };

            return result;
        }

        if (n * m != nums.length) {
            n = nums.length/2;
            m = nums.length/n;
        }

        int[][] result = new int[n][m];

        int numIndex = 0;
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++, numIndex++) {
                result[row][col] = nums[numIndex];
            }
        }

        return result;
    }

    /**
     * Checks to see if the number is a prime number
     * @param num The number you want to check
     * @return True if the number is prime and false if the number is not prime
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
