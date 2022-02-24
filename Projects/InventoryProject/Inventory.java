import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    private ArrayList<String> list;
    private String ownerName;
    private Scanner sc = new Scanner(System.in);

    protected boolean hasPassword; // Is true if user has a password
    private String password; // Password of user
    protected boolean unlocked; // If the inventory has been unlocked or not

    /**
     * A fresh inventory for the user. This is a constructor that asks the user for all the information needed to make an 
     * inventory. The user will input the name and if they want a password or not. If they need a password, then the computer 
     * will prompt them to enter in a password.
     */
    public Inventory() {
        list = new ArrayList<String>(); // User inventory

        System.out.print("Owner of Inventory >> ");
        ownerName = sc.nextLine(); // Gets uer name and sets it as ownerName

        System.out.print("Would you like a password? >> ");
        String response = sc.nextLine(); // Asks for password
        hasPassword = (response.toLowerCase().contains("ye")) ? true : false; // If userinput contains "ye" (can be in words or a word by itself), hasPassword will be true. Otherwise false.

        if (hasPassword) { // If the user wants a password, it asks for the user to set a password
            System.out.print("Please enter in a password >> ");
            password = sc.nextLine(); // Gets the password, inputted by the user.
            this.unlocked = false; // Locks inventory
        } else { // Otherwise if user does not want a password, inventory stays unlocked
            this.unlocked = true; 
        }
    }

    /**
     * A fresh inventory for the user. This constructor uses parameters, or hardcoded values, to create an inventory for the user.
     * This will mostly be used for testing but it can be used to create inventories for specific people and can specify if the user
     * wants a password or not.
     * 
     * @param name The name of the owner of the inventory
     * @param hasPassword True if the user wants a password for the inventory. If they don't it's false.
     */
    public Inventory(String name, boolean hasPassword) {
        list = new ArrayList<String>(); // New inventory for user
        ownerName = name; // User name is through the parameter
        this.hasPassword = hasPassword; // Uses parameter to check if user wants a password

        if (hasPassword) { // If user wants a password, computer will prompt them to enter a password. Then it locks the inventory
            System.out.print("Please enter in a password >> ");
            password = sc.nextLine();
            this.unlocked = false;
        } else { // Otherwise, it keeps the inventory unlocked
            this.unlocked = true;
        }

    }

    /**
     * Gets the inventory for the user
     * 
     * @return The ArrayList containing the user's inventory
     */
    public ArrayList<String> getInventory() {
        return list;
    }

    /**
     * Gets a specific item from an index specified by the user
     * 
     * @param index What position does the user want to get
     * @return Returns an item at a specified index from the inventory ArrayList
     */
    public String getInventory(int index) {
        return list.get(index);
    }

    /**
     * Gets the owner name of the inventory
     * 
     * @return A string containing the owner name
     */
    public String getOwner() {
        return ownerName;
    }

    /**
     * Changes the user name to the newOwner name
     * 
     * @param newOwner Name of new owner
     */
    public void setOwner(String newOwner) {
        ownerName = newOwner;
    }

    /**
     * Gets the size of the user's inventory
     * 
     * @return The size of the inventory ArrayList
     */
    public int getInventorySize() {
        return list.size();
    }

    /**
     * Locks the inventory. If the user does not have a password, it prompts the user and see if they want a password. If they 
     * do then it asks them to enter a password. If the user already has a password, then it just locks the inventory by 
     * changing the boolean value inside of unlocked to be false.
     */
    public void lock() {
        if (!hasPassword) {
            System.out.print("You do not have a password. Would you like one? >> ");
            String response = sc.nextLine();
            hasPassword = (response.toLowerCase().contains("ye")) ? true : false;
            if (hasPassword) {
                System.out.println("Please set a password >> ");
                password = sc.nextLine();
                this.unlocked = false;
            }
        } else {
            this.unlocked = false;
        }
    }

    /**
     * Checks to see if the password the user inputted matches the password of the inventory. If it does, it unlocks the 
     * inventory. Otherwise it keeps unlocked false.
     * 
     * @param password User inputted password. NOT inventory password.
     * @return The value of unlocked. Tells the user if they were able to get into the inventory or not.
     */
    public boolean unlock(String password) {
        if (unlocked) {
            System.out.println("Already unlocked.");
        } else {
            if (this.password.equals(password)) {
                this.unlocked = true;
            }
        }

        return this.unlocked;
    }

    /**
     * Asks the user for a password and return the password entered by the user.
     * 
     * @return String value containing user inputted value
     */
    public String getPassword() {
        String userResponse = "";
        if (hasPassword) {
            System.out.print("Password >> ");
            userResponse = sc.nextLine();
        }

        return userResponse;
    }

    /**
     * Gets the action, item, quantity, and index and decides what to do with them.
     * 
     * @param action Includes add, remove, replace, and clear
     * @param item User item that they want to manipulate
     * @param quantity Quantity. Currently only used for adding
     * @param index Index they want to manipulate
     */
    public void edit(String action, String item, int quantity, int index) {
        switch (action.toLowerCase()) {
            case "add":
                add(item, index, quantity);
                break;
            case "remove":
                remove(item, index, quantity);
                break;
            case "replace":
                replace(item, index);
                break;
            case "clear":
                list.clear();
                break;
            case "quit":
                break;
            default:
                System.out.println("Invalid Action");
        }

    }

    private void add(String item, int index, int quantity) {
        for (int i = 0; i < quantity; i++) {
            if (index == -1) {
                list.add(item);
            } else {
                list.add(index + i, item);
            }
        }
    }

    private void remove(String item, int index, int quantity) {
        // int itemCount = Collections.frequency(list, item);
        // if (quantity > itemCount) {
        // System.out.println("Not enough items");
        // } else {
        if (index == -1) {
            list.remove(item);
        } else {
            list.remove(index);
        }
        // }
    }

    private void replace(String item, int index) {
        if (index < 0) {
            System.out.println("Please specify an index.");
        } else {
            list.set(index, item);
        }
    }

    /**
     * Formatting. Includes user name, inventory, and inventory size.
     */
    public String toString() {
        return "Owner Name: " + ownerName + "\nInventory: " + list.toString() + "\nInventory Size: "
                + getInventorySize();
    }

}
