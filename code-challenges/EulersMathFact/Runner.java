package EulersMathFact;

/**
 * Name: Vedant Grover
 * Date: 12/19/21
 * Duck Buddy: Lance
 * 
 * Description: "If you randomly generate a number between 0 and 1 (inclusive),
 * then keep generating numbers until the sum of all your generated numbers
 * EXCEEDS 1, the average time (number of numbers generated) it takes to have a
 * sum greater than 1 approaches Euler's number.
 * 
 * Example: You generate a 0.25, then a 0.72, then a 0.41. That is 3 numbers
 * before the sum is greater than 1. However, if, on the next trial, you
 * generate a 0.92 then a 0.61, that is only 2 numbers. The number you are
 * averaging would be the 3 in the first trial and the 2 in 2nd trial. This
 * number approaches Euler's number."
 * 
 * This is actually pretty cool. This software simulates the trials. This helps
 * approve or disprove the math fact above. Keep in mind that the fewer trials you
 * have, the less accurate the numbers will be. I would recommend at least 50
 * trials.
 * 
 * I have commented out all of my test prints and code in Solver.java. To see
 * each trial in process, just uncomment the print line statements.
 */

public class Runner {
    public static void main(String[] args) {
        Solver solve = new Solver();
        solve.calc();
    }
}
