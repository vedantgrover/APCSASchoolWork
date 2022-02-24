package JanChallenges;
import java.util.Arrays;

public class GameGoals {
    public static void main(String[] args) {
        int[] goals = { 1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2 };
        int counter = 0;

        for (int i = 0; i < goals.length; i++) {
            System.out.println("Game " + (i + 1) + " goals scored: " + goals[i]);
        }

        System.out.println();

        while (counter < goals.length) {
            System.out.println("Game " + (counter + 1) + " goals scored: " + goals[counter]);
            counter++;
        }

        System.out.println();

        for (int i = goals.length - 1; i > 0; i--) {
            System.out.println("Game " + (i) + " goals scored: " + goals[i]);
        }

        System.out.println();

        System.out.println("Game " + (findIndex(goals, largest(goals)) + 1) + " has the largest goal of " + largest(goals) + " points.");
    }

    // Linear-search function to find the index of an element
    public static int findIndex(int arr[], int t) {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static int largest(int[] arr) {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }
}