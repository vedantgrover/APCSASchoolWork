package Hangman;

import java.io.*;
import java.util.*;

public class Board {
    // Attributes
    private String phrase; // The phrase to guess.
    private int pointsRemaining; // Points remaining left to be earned from the class.
    private String solvedBoard = ""; // Phrase to be solved.
    protected boolean isSolved; // Has the phrase been solved?
    protected int guessPoints;

    private ArrayList<String> phraseList = new ArrayList<String>(); // Imports all the phrases from the phrases.txt
                                                                    // file.

    private HashMap<String, Integer> pointValue = new HashMap<String, Integer>(); // Maps the alphabet to it's point
                                                                                  // value from alphabetPointValue.csv

    public Board(String phrase) {
        this.phrase = phrase.toUpperCase();
        solvedBoard = getBoard();

        //System.out.println(this.phrase);
        System.out.println(solvedBoard);
    }

    public Board() {
        this.phrase = loadPhrase();
        solvedBoard = getBoard();

        //System.out.println(phrase);
        System.out.println(solvedBoard);
    }

    private String loadPhrase() {
        try {
            Scanner input = new Scanner(new File(
                    "C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\code-challenges\\Hangman\\phrases.txt"));
            while (input.hasNextLine()) {
                String str = input.nextLine().trim().toUpperCase();
                String temp = "";
                for (int i = 0; i < str.length() - 1; i++) {
                    if (str.substring(i, i + 1).equals("?")) {
                        temp += "'";
                    } else
                        temp += str.substring(i, i + 1);
                }
                str = temp + str.substring(str.length() - 1);
                phraseList.add(str);
            }
            int rand = (int) (Math.random() * phraseList.size());
            return phraseList.get(rand);
        } catch (Exception e) {
            System.out.println("Error reading or parsing phrases.txt");
            return null;
        }
    }

    /*
     * this.phrase.substring(i, i + 1).equals("&") || this.phrase.substring(i, i +
     * 1).equals("-") || this.phrase.substring(i, i + 1).equals("'") ||
     * this.phrase.substring(i, i + 1).equals("?") || this.phrase.substring(i, i +
     * 1).equals(" ")
     */

    private String getBoard() {
        for (int i = 0; i < this.phrase.length(); i++) {
            if (!Character.isLetter(this.phrase.charAt(i))) {
                solvedBoard += this.phrase.substring(i, i + 1);
            } else {
                solvedBoard += "_";
            }
        }

        for (int i = 0; i < this.phrase.length(); i++) {
            pointsRemaining += getLetterPointValue(this.phrase.substring(i, i + 1));
        }

        System.out.println("Total Points : " + pointsRemaining);

        return solvedBoard;
    }

    public int getLetterPointValue(String userCharacter) {
        try {
            // System.out.println("In Try Catch");
            Scanner input = new Scanner(new File(
                    "C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\code-challenges\\Hangman\\alphabetPointValue.csv"));
            // System.out.println("Getting File");
            while (input.hasNextLine()) {
                // System.out.println("In While Loop");
                String[] temp = input.nextLine().split(",");
                // System.out.println("Added data to String[] temp.");
                pointValue.put(temp[0], Integer.parseInt(temp[1]));
                // System.out.println("Added data to ArrayList pointvalue");
            }
            input.close();
            // System.out.println("Closed Scanner input");
        } catch (Exception e) {
            System.out.println("Error reading or parsing alphabetPointValue.csv");
            System.err.println(e);
        }

        try {
            return pointValue.get(userCharacter.toLowerCase());
        } catch (Exception e) {
            return 0;
        }
    }

    public String updateBoard(String letter) {
        char[] solvedPhrase = solvedBoard.toCharArray();
        if (letter.length() == 1) {
            for (int i = 0; i < solvedBoard.length(); i++) {
                if (solvedBoard.charAt(i) == ' ') {
                    continue;
                } else if (this.phrase.substring(i, i + 1).equals(letter.toUpperCase())) {
                    if (this.phrase.substring(i, i + 1).equals(this.solvedBoard.substring(i, i + 1))) {
                        System.out.println(
                                "BRO. THAT'S ALREADY BEEN ENTERED. ARE YOU BLIND? IT'S LITERALLY RIGHT THERE!!!");
                        PhraseSolver.skipPlayer();
                        continue;
                    } else {
                        solvedPhrase[i] = letter.toUpperCase().charAt(0);
                        pointsRemaining -= getLetterPointValue(letter);
                        guessPoints += getLetterPointValue(letter);
                        //System.out.println(pointsRemaining);
                    }
                }
            }
        } else {
            String phraseWithNoPunctuation = removePunc(phrase);
            String guessWithoutPunction = removePunc(letter);
            System.out.println(phraseWithNoPunctuation);
            for (int i = 0; i < phrase.length(); i++) {

                if (guessWithoutPunction.toUpperCase().equals(phraseWithNoPunctuation.toUpperCase())) {
                    for (int currentPhraseLetter = 0; currentPhraseLetter < solvedBoard
                            .length(); currentPhraseLetter++) {
                        solvedPhrase[i] = letter.toUpperCase().charAt(i);
                        pointsRemaining -= pointsRemaining;
                    }
                } else {
                    System.out.println("Not the phrase buddy mate.");
                    PhraseSolver.skipPlayer();
                }
            }
        }

        solvedBoard = String.valueOf(solvedPhrase);

        if (this.pointsRemaining <= 0) {
            this.isSolved = true;
        }

        return solvedBoard;
    }

    public String removePunc(String phrase) {
        String str = phrase;
        // System.out.println(str);
        String result = str.replaceAll("\\p{Punct}", "");
        // System.out.println(result);

        return result;
    }

    // Accesors and Mutators
    // region
    public String getPhrase() {
        return this.phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public boolean isSolved() {
        return this.isSolved;
    }
    // endregion
}