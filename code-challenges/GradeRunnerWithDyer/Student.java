package GradeRunnerWithDyer;

public class Student {
    // Attributes
    private String name;
    private int year;
    private int[] scores;

    // Constructors
    public Student(String name, int year) {
        this.name = name;
        this.year = year;

        this.scores = new int[10];
    }

    // Getters and setters
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
        return scores;
    }

    /**
     * This method returns a value at a certain index in the scores array.
     * 
     * @param index - this is the index you want.
     * @return - Returns the value at your specified index.
     */
    public int getScore(int index) {
        return scores[index];
    }

    /**
     * this method inputs and index and a value and stores the value in the index of
     * the score array
     * 
     * @param index - desired index of score array
     * @param score - desired value of insert
     */
    public void setScore(int index, int score) {
        scores[index] = score;
    }

    public double averageScore() {
        double result = 0;
        for (int score : scores) {
            result += score;
        }

        result /= scores.length;
        return result;
    }

    public int maxScore() {
        int maxValue = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxValue) {
                maxValue = scores[i];
            }
        }
        return maxValue;
    }

    public int minScore() {
        int minValue = maxScore();
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < minValue) {
                minValue = scores[i];
            }
        }
        return minValue;
    }

    public int modeScore() {
        int result = 0;
        int highestRepeat = 0;
        for (int i = 0; i < scores.length; i++) {
            int repeatAmount = 1;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] == scores[j]) {
                    repeatAmount++;
                    if (repeatAmount > highestRepeat) {
                        result = scores[i];
                        highestRepeat = repeatAmount;
                    }
                }
            }
        }
        return result;
    }
}
