package Rock_Paper_Journey;

import java.util.Scanner;

public class Player {
    // Initializing Variables
    private String name;
    private int score;
    private String choice;
    private boolean isComp;

    /**
     * 
     * @param name   makes taunts personal
     * @param isComp set true for if it is a computer and set false for if it isn't
     *               a computer.
     */
    public Player(String name, boolean isComp) {
        // Creating a new object and initializing the values to a variable.
        this.name = name;
        this.isComp = isComp;
        this.score = 0;
    }

    // Sets a choice based off of whether or not they are a human.
    public void setChoice() {
        // If else statement checking if the player is a bot or a human.
        if (isComp == false) {
            // Creating a new Scanner to take in user input.
            Scanner sc = new Scanner(System.in);
            System.out.print("Rock Paper Scissor Shoot!\nYour choice : "); // Print statement letting the user know that
                                                                           // it is time
            // for them to type their choice in.
            String choice = sc.nextLine(); // Letting the user type and storing the variable into a local variable
                                           // called choice.
            this.choice = choice.toLowerCase(); // Reassigning the variable choice to be the user inputted choice.

        } else {
            // Creating a Random Number and Initializing Variables
            int compChoiceNumber = (int) (Math.random() * 3) + 1; // Random Number
            String compChoice; // Initialized Variable
            // Using Switch Cases to assign each number to an option of Rock, Paper, or
            // Scissor
            switch (compChoiceNumber) { // Same reasoning as if <number>, compChoice = <choice>. Instead of using if
                                        // statements I used switch case statements
                case 3:
                    compChoice = "rock";
                    break;
                case 2:
                    compChoice = "paper";
                    break;
                case 1:
                    compChoice = "scissor";
                    break;
                default:
                    compChoice = "Something went wrong : Random Number Generator.";
            }
            // Reassigning the variable choice to be the computer choice.
            this.choice = compChoice;
        }
    }

    // Gets the player choice.
    public String getChoice() {
        return this.choice; // Returns the value of the function to be "choice";
    }

    // Increments the score by one.
    public void scoreUp() {
        score++;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void compareTo(String oppChoice) {
        /**
         * If win, increase score If tie or loss, no score increase
         */

         if (choice.equals("rock") && oppChoice.equals("scissor")) {
             score++;
         }

         if (choice.equals("paper") && oppChoice.equals("rock")) {
             score++;
         }

         if(choice.equals("scissors") && oppChoice.equals("paper")) {
             score++;
         }

        

    }
}
