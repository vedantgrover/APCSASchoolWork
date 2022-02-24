package Banking_System;

public class BankClient {

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

    // Attributes
    private boolean isVIP;
    private String clientName;
    private double bal;
    private String currencyName = "byte";

    /**
     * 
     * @param name  - Client name. Who is this banking system for?
     * @param isVIP - Has this person bought a VIP pass?
     */
    public BankClient(String name, boolean isVIP) {
        if (isVIP == true) {
            this.bal = 100;

        } else {
            this.bal = 0;
        }

        this.clientName = name;
        this.isVIP = isVIP;

    }

    // Getters
    public double getBal() {
        return this.bal;
    }

    private boolean checkVIP() {
        return this.isVIP;
    }

    public String getName() {
        return this.clientName;
    }

    // Setters
    public void setBal(double bal) {
        this.bal = bal;
    }

    public void setName(String newName) {
        this.clientName = newName;
    }

    public void buyVIP() {
        if (checkVIP() == true) {
            System.out.println("Already Bought mate");
        } else {
            if (this.bal < 300) {
                System.out.println("You cannot afford a VIP Pass peasant.");
            } else {
                this.isVIP = true;
                this.bal -= 300;
                System.out.println("Bought");
            }
        }
    }
    // Equal Method. Will return true or false if someone's name is the same as anyone elses.
    public boolean equalName(BankClient bankDude) {
        return this.clientName == bankDude.getName();
    }
    // Will return a summary of the person's account
    public String toString() {
        return this.clientName + " has " + this.bal + " " + currencyName + "(s)\nVIP Status : " + this.isVIP;
    }
    // Will deposit or withdraw money from the accounts.
    public void deposit(double chezits) {
        this.bal += chezits;
        System.out.println("Deposit Successful : Put " + chezits + " " + currencyName + "(s) into your account.");
    }

    public void withdraw(double chezits) {
        if (chezits > this.bal) {
            System.out.println("Sorry, but you do not have enough " + currencyName + "s.");
        } else {
            this.bal -= chezits;
            System.out.println("Withdrawl Successful : Withdrawn " + chezits + " chezits into your account.");
        }
    }
}