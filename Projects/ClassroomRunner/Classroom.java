import java.util.Random;

public class Classroom {

    // attributes
    private Student stu1;
    private Student stu2;
    private int numAssignments;

    // constructor
    public Classroom() {
        this.numAssignments = 0;
        this.stu1 = new Student();
        this.stu2 = new Student();
    }

    // inSession method
    public void inSession() {
        Random rand = new Random();
        stu1.updateStress(this.numAssignments);
        stu2.updateStress(this.numAssignments);
        if (rand.nextBoolean()) {
            stu1.recover();
            stu2.recover();
        }
        System.out.println("Number of Assignments :: " + this.numAssignments);
        System.out.println(
                "Student 1 : " + this.stu1.getName() + " : Stress Levels :: " + this.stu1.getStressLevel());
        System.out.println(
                "Student 2 : " + this.stu2.getName() + " : Stress Levels :: " + this.stu2.getStressLevel());
        this.numAssignments++;

        double completeAssignment = stu1.getCompleteLikelihood();
        double completeAssignment2 = stu2.getCompleteLikelihood();

        while (this.numAssignments < 10) {
            stu1.updateStress(this.numAssignments);
            stu2.updateStress(this.numAssignments);
            double heal = Math.random();

            if (heal <= completeAssignment) {
                System.out.println("\n Stu1 : " + completeAssignment + ": Heal: " + heal +"\n");
                stu1.completeAssignment();
            } else if (heal <= completeAssignment2) {
                System.out.println("\n Stu1 : " + completeAssignment2 + ": Heal: " + heal + "\n");
                stu2.completeAssignment();
            }

            if (rand.nextBoolean()) {
                stu1.recover();
                stu2.recover();
            }
            System.out.println("Number of Assignments :: " + this.numAssignments);
            System.out.println(
                    "Student 1 : " + this.stu1.getName() + " : Stress Levels :: " + this.stu1.getStressLevel());
            System.out.println(
                    "Student 2 : " + this.stu2.getName() + " : Stress Levels :: " + this.stu2.getStressLevel());
            this.numAssignments++;
        }
        System.out
                .println("\nStudent 1 : " + this.stu1.getName() + " : Stress Levels :: " + this.stu1.getStressLevel());
        System.out.println("Student 2 : " + this.stu2.getName() + " : Stress Levels :: " + this.stu2.getStressLevel());
    }
}
