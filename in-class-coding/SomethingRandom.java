import java.util.Scanner;

public class SomethingRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int val = 0;
        while (count<5) {
            System.out.println("Type the word yes (or don't, I don't care): ");
            String str = sc.nextLine().toLowerCase();
            if (str.equals("yes")) {
                System.out.println("nice");
                count++;
            } else {
                System.out.println("oh noo");
            }
            val++;
        }
        System.out.println("It took you " + val + " tries to type \"yes\" five times.");

        count=0;
        for (int i=0; i<5; i++) {
            System.out.println("Type the word squee (or don't, I don't care): ");
            String str = sc.nextLine().toLowerCase();
            if (str.equals("squee")) {
                System.out.println("squee-dat");
                count++;
            } else {
                System.out.println("oh noo");
            }
        }
        System.out.println("You typed \"squee\" " + count + " times in five tries");
    }
}
