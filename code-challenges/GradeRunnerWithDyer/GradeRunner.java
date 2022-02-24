package GradeRunnerWithDyer;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class GradeRunner {
    public static void main(String[] args) {
        Student stu = new Student("Scott", 2005);

        for (int i = 0; i < stu.getScores().length; i++) {
            int rand = (int) Math.floor(Math.random() * (1600 - 400 + 1) + 400);
            stu.setScore(i, rand);
        }
        System.out.println(Arrays.toString(stu.getScores()));
        System.out.println(stu.maxScore());
        System.out.println(stu.minScore());
        System.out.println(stu.modeScore());

        System.out.println();
        saveStudent(stu);
    }

    public static void saveStudent(Student s) {
        try {
            File file = new File("C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\code-challenges\\GradeRunnerWithDyer\\" + s.getName() + ".txt");
            if (file.createNewFile()) {
                System.out.println("File Created for " + s.getName());
            } else {
                System.out.println(s.getName() + "'s file already exists.");
            }
            FileWriter writer = new FileWriter(file);
            // Create a writer
            // use the writer to write the save in the followig format:
            writer.write(s.getName() + "\n");
            writer.write(s.getYear() + "\n");
            for (int i= 0; i < s.getScores().length; i++) {
                if(s.getScore(i) == 0) {
                    writer.write("null, ");
                } else if (i == s.getScores().length - 1) {
                    writer.write(s.getScore(i) + "\n");
                } else {
                    writer.write(s.getScore(i) + ", ");
                }
            }

            writer.close();

            

            /*
             * student name
             * student year
             * score array -> formatted like in the example (no brackets! no spaces! just
             * commas!)
             * 
             * Horrace
             * 2007
             * 50,65,79,null,80,etc...
             * 
             * note: A 0 in the array should store as null in the save file
             */

        } catch (Exception e) {
            System.out.println("Error on file save >> " + e.getLocalizedMessage());
        }
    }

    // public static Student loadStudent(String filename) {
    //     Student s;
    //     try {
    //         // create a file object from the desired save file
    //         // use Scanner to read the file
    //         // remember, scanner can read nextLine() and can read next()
    //         // I would not be surprised if you made two scanners
    //         // you can use the method useDelimeter(<String>) to set the delimeter to a comma
    //         // to help you read the array values

    //     } catch (Exception e) {
    //         System.out.println("Error on file load >> " + e.getLocalizedMessage());
    //     }
    //     return s;
    // }
}
