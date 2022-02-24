package BigO;

public class Main {

    public static void main(String[] args) {
        final int SIZE = 100000;
        final double CONVERT = 1000000.0;

        double time0 = System.nanoTime();

        int sum = 0;
        for (int i=0; i<SIZE; i++) {
            int rand = (int) (Math.random()*2);
            if (rand==0) sum+=1;
            else sum-=1;
        }
        double time1 = System.nanoTime();
        double delta1 = (time1-time0)/CONVERT;
        System.out.println("Sum: " + sum + "\nOperation took: " + delta1 + " milliseconds");

        double time2 = System.nanoTime();
        int newSum = 0;
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                int rand = (int) (Math.random()*2);
                if (rand==0) newSum+=1;
                else newSum-=1;
            }
        }
        double time3 = System.nanoTime();
        double delta2 = (time3-time2)/CONVERT;
        System.out.println("Sum: " + newSum + "\nOperation took: " + delta2 + " milliseconds");

        //System.out.println(delta1 + "^2 = " + Math.pow(delta1,2) + "\nCompared to: " + delta2);
    }
}