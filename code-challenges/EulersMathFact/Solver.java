package EulersMathFact;

import java.util.*;

public class Solver {
    // Attributes
    private int trials;
    private ArrayList<Integer> gens = new ArrayList<Integer>();

    // Constructor
    /**
     * This constructor helps initalize the object which contains all the logic.
     * @param trials - How many trials do you want the software to perform?
     */
    public Solver(int trials) {
        this.trials = trials;
    }

    /**
     * This constructor initializes the amount of trials by asking the user.
     */
    public Solver() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Trials ::> ");
        trials = sc.nextInt();
        sc.close();
    }

    public void calc() {
        double avg;
        String response;
        for (int i = 1; i <= trials; i++) {
            //System.out.println("Trial Number :: " + i);
            //System.out.println("Number of Trials :: " + trials);
            oneGen();
        }
        avg = avg(gens);
        /* 
         * This is something cool I learnt about today. Wanna see it work? Uncomment
         * line 40 and then replace "(avg < Math.E)" on line 43 with "response".
         */
        // response = (avg < Math.E) ? "Yes Boomer":"No. Boomer";
        //System.out.println("Gens :: " + gens);
        System.out.println("\nAverage Gens :: " + avg);
        //System.out.println("Approaching Euler's Number :: " + (avg < Math.E)); // This will only work if it is less than the exact value of e. It will be wrong at times.

    }

    private void oneGen() {
        ArrayList<Double> genValues = new ArrayList<Double>();
        double sum = 0;

        while (sum <= 1) {
            double rand = Math.random() * (1 + 2.5e-16);
            //System.out.println(rand);
            genValues.add(rand);
            sum += rand;
        }
        //System.out.println("\nSum :: " + sum + "\n");
        gens.add(genValues.size());
    }

    /**
     * 
     * @param array - This averages out all the values within an INTEGER ARRAYLIST. Input your arraylist here.
     * @return - returns the averaged values from all the numbers in the ArrayList.
     */
    private double avg(ArrayList<Integer> array) {
        double total = 0;
        double avg = 0;

        for (int i = 0; i < array.size(); i++) {
            total += array.get(i);
            avg = total / array.size();
        }
        return avg;
    }
}
