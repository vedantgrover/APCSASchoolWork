package GradeRunner;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class GradeRunner {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student("Vedant", 10);
        students[1] = new Student("Blade", 11);
        students[2] = new Student("Freyr", 12);
        students[3] = new Student("The pain", 4);
        students[4] = new Student("Pops", 43);
        students[5] = new Student("Mommasita", 16);

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null)
                continue;

            for (int scores = 0; scores < students[i].getScores().length; scores++) {
                int rand = (int) Math.floor(Math.random() * (1600 - 400) + 400);
                students[i].setScore(scores, rand);
            }
        }

        for (Student stu : students) {
            if (stu == null)
                continue;

            try {
                File newFile = new File(
                        "C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\code-challenges\\GradeRunner\\"
                                + stu.getName() + ".txt");
                if (newFile.createNewFile()) {
                    System.out.println(stu.getName() + "'s file has been created.");
                } else {
                    System.out.println(stu.getName() + "'s file already exists.");
                }
                FileWriter writer = new FileWriter(newFile);
                writer.write("Student Name: " + stu.getName() + "\nYear: " + stu.getYear() + "\n");
                writer.write("Scores: " + Arrays.toString(stu.getScores()) + "\n");
                writer.write("Average Score: " + avgArr(stu.getScores()) + "\n");
                writer.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static int avgArr(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result += num;
        }

        result /= arr.length;

        return result;
    }
}
