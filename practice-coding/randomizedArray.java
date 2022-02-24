import java.util.Arrays;

public class randomizedArray {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] randomNums = new int[nums.length];
        int maxValue = nums.length - 1;
        nums[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + 1;
        }

        for (int i = 0, j = 0; i < nums.length && j < randomNums.length; i++, j++) {
            int rand = (int) (Math.random() * maxValue);
            randomNums[j] = nums[rand];
            nums[rand] = nums[maxValue];
            maxValue--;
        }

        System.out.println();
        System.out.println(Arrays.toString(randomNums));
    }
}