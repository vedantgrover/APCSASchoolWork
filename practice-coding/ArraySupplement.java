import java.util.Arrays;

public class ArraySupplement {
    public static void main(String[] args) {
        int[] intArr = {1, 3, 6, 7, 12};
        int[] intArr2 = {2, 5, 6, 7, 8, 4, 3, 1};
        int[] intArr3 = {4, 3, 2, 1, 6, 5, 8, 7, 0, 9};
        int[] intArr4 = {12, 45, 6, 3, 4, 8, 9};
        int[] intArr5 = {2};

        int one = 1;
        int two = 2;

        System.out.println(Arrays.toString(intArr) + " :: " + minGap(intArr));
        System.out.println(Arrays.toString(intArr2) + " :: " + minGap(intArr2));
        System.out.println(Arrays.toString(intArr3) + " :: " + minGap(intArr3));
        System.out.println(Arrays.toString(intArr4) + " :: " + minGap(intArr4));
        System.out.println(Arrays.toString(intArr5) + " :: " + minGap(intArr5));
        System.out.println();
        System.out.println(one + two + "Z");
    }

    public static int minGap(int[] a) {
        if (a.length < 2) return 0;
        int lowestGap = a.length;
        int tempGap = 0;
        for (int i = 1; i < a.length; i++) {
            tempGap = a[i] - a[i - 1];
            if (tempGap < lowestGap) {
                lowestGap = tempGap;
            }
        }

        return lowestGap;
    }
}