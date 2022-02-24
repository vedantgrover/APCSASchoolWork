package Hangman;

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        PhraseSolver p = new PhraseSolver();
        p.play();
    }
}