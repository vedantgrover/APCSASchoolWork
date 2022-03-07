package Concentration;

import java.util.ArrayList;

public class RandomPermutation {

    /**
     * Generates a random perumuation of the numbers 1 thru 10
     * @return int array [1,2,3,...,10] but RANDOMIZED
     */
    public static int[] next() {
        int[] source = {1,2,3,4,5,6,7,8,9,10};
        int[] permutation = new int[source.length];

        int last = source.length;
        for (int i=0; i<source.length; i++) {
            int rand = (int) (Math.random()*last);
            permutation[i] = source[rand];
            source[rand] = source[last-1];
            last--;
        }
        return permutation;
    }

    /**
     * Generates a random permutation of the numbers 1 thru maxVal without
     * repeating.
     * @param maxVal maximum value in the random perumation list
     * @return int array [1, 2, ..., maxVal] but RANDOMIZED 
     */
    public static int[] next(int maxVal) {
        int[] source = new int[maxVal];
        for (int i=0; i<maxVal; i++) {
            source[i] = i+1;
        }
        int[] permutation = new int[source.length];

        int last = maxVal;
        for (int i=0; i<source.length; i++) {
            int rand = (int) (Math.random()*last);
            permutation[i] = source[rand];
            source[rand] = source[last-1];
            last--;
        }
        return permutation;
    }

    /*
    public static ArrayList<Horse> next(ArrayList<Horse> hList) {
        ArrayList<Horse> hRand = new ArrayList<Horse>();
        int[] randomized = next(hList.size());
        for (int i : randomized) {
            hRand.add(hList.get(i-1));
        }
        return hRand;
    }
    */
    // public static ArrayList<Object> next(ArrayList<Object> o) {
    //     ArrayList<Object> retList = new ArrayList<Object>();
    //     int[] randomized = next(o.size());
    //     for (int i : randomized) {
    //         retList.add(o.get(i-1));
    //     }
    //     return retList;
    // }
}