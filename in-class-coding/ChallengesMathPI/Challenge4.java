package ChallengesMathPI;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> allPrimes = new ArrayList<Double>();
        boolean validInput = false;

        int maxNum = 0;
        while (!validInput) {
            System.out.print("Max Number >> ");
            maxNum = sc.nextInt();

            if (maxNum > 1000000) {
                System.out.println("Too big!! Max number is 1,000,000");
            } else {
                validInput = true;
            }
        }

        for (int i = 2; i <= maxNum; i++) {
            if (isPrime(i)) {
                int nearestMultiple = 4 * (Math.round((float) i / 4));
                allPrimes.add((i / (double) nearestMultiple));
            }
        }

        double totalProduct = 1;
        for (int i = 0; i < allPrimes.size(); i++) {
            totalProduct *= allPrimes.get(i);
        }

        System.out.println("Number of Trials :> " + allPrimes.size());
        System.out.println("The Final Product :> " + totalProduct);
        System.out.println("Final Product * 4 :> " + (totalProduct * 4));

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
