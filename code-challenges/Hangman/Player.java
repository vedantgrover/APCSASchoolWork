package Hangman;

import java.util.Scanner;

public class Player {
    // Attributes
    private String name; // Name of the Player
    private int score; // How many points does the player have right now.
    protected boolean playerSkip = false;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public Player() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of Player >> ");
        name = sc.nextLine();
    }

    // region
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void scoreUp(int value) {
        this.score += value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // endregion

}
