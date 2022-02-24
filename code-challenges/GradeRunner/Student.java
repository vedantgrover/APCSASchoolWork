package GradeRunner;

public class Student {
    // Attributes
    private String name;
    private int year;
    private int[] scores;

    // Constructor
    public Student(String name, int year) {
        this.name = name;
        this.year = year;
        this.scores = new int[8];
    }

    // Accessors and Mutators
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int[] getScores() {
        return this.scores;
    }

    public void setScore(int index, int value) {
        scores[index] = value;
    }
}
