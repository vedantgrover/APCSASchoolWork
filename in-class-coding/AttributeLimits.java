import java.util.Scanner;

public class AttributeLimits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Say I have an int attribute called "luck" that I want to have
         * a max value of 'level' and a minimum value of 0.
         */
        int level = 10;
        int luck = level;

        /**
         * Run the code until it stops you. When you get to the end, use MORE luck than
         * you
         * currently have to bring the total to a negative.
         */
        while (luck > 0) {
            System.out.println("Use some luck points!" +
                    "\nHow many do you use?");
            int reduce = sc.nextInt();
            sc.nextLine();
            luck = Math.max(luck-reduce, 0); 
            System.out.println("Nice! You have " + luck + " remaining.\n==================");
        }

        System.out.println("You have " + luck + " points after the first loop.\nResetting luck...(hit enter)");
        sc.nextLine();
        luck = 0;
        System.out.println();

        while (luck < level) {
            System.out.println("You currently have " + luck
                    + " luck.\nDo you want to recover some luck? You have to say yes...(hit enter)");
            sc.nextLine();
            int recover = (int) (Math.random() * 6 + 2);
            luck = Math.min(luck + recover, level);
            System.out.println("You recover " + recover + " luck." +
                    "\nYou have " + luck + " luck points.");
        }

        System.out.println("You have " + luck + " points after the first loop");
        sc.close();

        /**
         * Option A would be to restrict the user to use only numbers currently
         * available
         * 
         * Option B would be to let the user choose any number and just overwrite the
         * final
         * luck value with either the max or the min.
         * 
         * Discuss with your table group how you would do both.
         */
    }
}
