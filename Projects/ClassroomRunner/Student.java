import java.util.Scanner;

public class Student {

    private String name;
    private double stressLevel;
    private double increaseStressLevelChange;

    private double completeLikelihood;

    // Make sure this class constructor meets the requirements
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name here student >> ");
        name = sc.nextLine();

        stressLevel = 0;
        completeLikelihood = (Math.random() * (0.95 - 0.2)) + 0.2;
    }

    public double getCompleteLikelihood() {
        return completeLikelihood;
    }

    public void setCompleteLikeliHood(double newVal) {
        completeLikelihood = newVal;
    }

    /**
     * This method will be completed by student. It should
     * add the int parameter to the current stressLevel of
     * the student.
     */
    public void updateStress(int assignments) {
        increaseStressLevelChange = (0.5 * assignments * (assignments + 1));
        stressLevel += (0.5 * assignments * (assignments + 1));
    }

    /**
     * This method will be completed by student. It should
     * subtract the random number from the current stressLevel of
     * the student. Minimum should be 0
     */
    public void recover() {
        int rand = (int) Math.floor(Math.random() * (5 - 1 + 1) + 1);
        if (this.stressLevel - rand < 0) {
            this.stressLevel = 0;
        } else {
            this.stressLevel -= rand;
        }
    }

    // accessors and mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStressLevel() {
        return stressLevel;
    }

    public void setStressLevel(int stressLevel) {
        this.stressLevel = stressLevel;
    }

    public void completeAssignment() {
        stressLevel -= increaseStressLevelChange;
    }

}
