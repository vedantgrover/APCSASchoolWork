package BinaryTester;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Scanner sc = new Scanner(System.in);

        tree.add("Does the animal have legs?", false);

        while (true) {
            String userResponse;
            System.out.println("Think of an animal. Okay, now I will try to guess the animal!");
            System.out.print(tree.root.value + " >> ");
            userResponse = sc.nextLine();
            // Remove and try first
            if (userResponse.equalsIgnoreCase("quit"))
                break;

            if (userResponse.contains("yes")) {
                tree.add("Is it a dog?", false);
            } else if (userResponse.contains("no")) {
                tree.add("Is it a snake?", true);
            } else if (userResponse.contains("show")) {
                tree.traverseInOrder(tree.root);
                break;
            } else {
                System.out.println("Please enter either a yes or no.");
                continue;
            }
        }
    }
}
