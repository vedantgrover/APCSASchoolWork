package Concentration;

public class RandomPermutation {

    /**
     * Generates a random perumuation of the numbers 1 thru 10
     * 
     * @return int array [1,2,3,...,10] but RANDOMIZED
     */
    public static int[] next(int maxVal) {
        int[] nums = new int[maxVal];
        int[] randomNums = new int[nums.length];
        int maxValue = nums.length - 1;
        nums[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            int rand = (int) (Math.random() * maxValue);
            randomNums[i] = nums[rand];
            nums[rand] = nums[maxValue];
            maxValue--;
        }

        return randomNums;
    }
}