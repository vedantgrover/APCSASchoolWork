package Banking_System;

import java.util.Scanner;

public class BankRunner {
  /**
   * Vedant Grover
   * Duck Buddy : Lance
   * Date : 11/08/21
   * BankRunner
   * 
   * This program helps organize and stores your bank values when you deposit
   * or withdraw any money. You can ask for a summary, a deposit, a withdrawl, or 
   * buy a VIP pass. The pass costs 300 bytes. You must include at least these words. No labels:
   *    deposit <value>
   *    withdraw <value>
   *    buy vip
   *    quit or q
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is your name new client?");
    String userName = sc.nextLine();
    BankClient bob = new BankClient(userName.toLowerCase(), false);
    BankClient jefferyPrestonBezos = new BankClient("Jeffery Preston Bezos", true);
    BankClient elonReeveMuskFRS = new BankClient("Elon Reeve Musk FRS", true);
    BankClient markElliotZuckerberg = new BankClient("Mark Elliot Zuckerberg", true);

    // Setting all the values for our two billionares.
    jefferyPrestonBezos.setBal(203000000000.0);
    elonReeveMuskFRS.setBal(318400000000.0);
    markElliotZuckerberg.setBal(122000000000.0);


    // Comparing
    System.out.println(whoIsRicher(elonReeveMuskFRS, bob) + " is richer.");
    System.out.println(whoIsRicher(jefferyPrestonBezos, bob) + " is richer.");
    System.out.println(whoIsRicher(markElliotZuckerberg, bob) + " is richer.");


    String userInput = "";
    while (!userInput.toLowerCase().contains("quit") && !userInput.toLowerCase().equals("q")) {
      System.out.println("Please tell us what you would like to do.");
      userInput = sc.nextLine();
      if (userInput.toLowerCase().contains("deposit ")) {
        String someResponse = userInput.toLowerCase().substring(0, userInput.toLowerCase().indexOf("it ") + 3);
        String stringNumber = userInput.toLowerCase().replace(someResponse, "");
        int n = Integer.valueOf(stringNumber);
        bob.deposit(n);
      } else if (userInput.toLowerCase().contains("deposit")) {
        bob.deposit(1);
      } else if (userInput.toLowerCase().contains("withdraw ")) {
        String someResponse = userInput.toLowerCase().substring(0, userInput.toLowerCase().indexOf("aw ") + 3);
        String stringNumber = userInput.toLowerCase().replace(someResponse, "");
        int n = Integer.valueOf(stringNumber);
        bob.withdraw(n);
      } else if (userInput.toLowerCase().contains("withdraw")) {
        bob.withdraw(1);
      } else if (userInput.toLowerCase().contains("vip") && userInput.toLowerCase().contains("buy")) {
        bob.buyVIP();
      } else if (userInput.toLowerCase().contains("summary") || userInput.toLowerCase().contains("overview")) {
        System.out.println(bob.toString() + "\nMILLIONARE : " + isMillionare(bob));
      }
    }

  }

  public static boolean isMillionare(BankClient bc) {
    if (bc.getBal() >= 1000000) {
      return true;
    } else {
      return false;
    }
  }

  public static String whoIsRicher(BankClient bill, BankClient joe) {
    if (bill.getBal() > joe.getBal()) {
      return bill.getName();
    } else if (joe.getBal() > bill.getBal()) {
      return joe.getName();
    } else {
      return "They are equally as rich";
    }
  }
} 