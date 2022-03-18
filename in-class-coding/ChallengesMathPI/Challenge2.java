package ChallengesMathPI;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> allPrimes = new ArrayList<Integer>();
        int[] percentLandMarks = {1, 10, 50, 100};

        boolean validInput = false;
        int maxNum = 0;
        while (!validInput) {
            System.out.print("Max Number >> ");
            maxNum = sc.nextInt();

            if (maxNum > 1000000) {
                System.out.println("Too Big!! Max number is 1,000,000");
            } else {
                validInput = true;
            }
        }

        for (int i = 2; i <= maxNum; i++) {
            if (isPrime(i)) {
                allPrimes.add(i);
            }
        }

        double sum = -1;
        int landmarkIndex = 0;
        for (int i = 0; i < allPrimes.size(); i++) {
            sum += (1.0 / allPrimes.get(i));

            double percent = (i * 100.0)/allPrimes.size();
            
            double percentIncrease = 100.0/allPrimes.size();

            if ((percent >= percentLandMarks[landmarkIndex] - percentIncrease && percent <= percentLandMarks[landmarkIndex] + percentIncrease)) {
                System.out.println(percent);
                landmarkIndex++;
            }

        }

        System.out.println(sum);
        System.out.println(allPrimes.size());

        sc.close();
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
