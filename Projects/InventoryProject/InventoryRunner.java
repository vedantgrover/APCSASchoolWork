import java.util.Scanner;

public class InventoryRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory(); // New Inventory for user. User inputs name and if they want password

        System.out.println(
                "Welcome to your inventory!\nWhen typing out your commands, make sure to use the format <action> <item> <quantity> <index>\nP.S If you would like to make the index irrelevent (such as adding an element at the end) just put a -1"); // Welcome message

        while (true) { // Keep going till user wants to stop
            if (!inventory.unlocked) { // If Inventory is locked, keep getting the password until the password matches
                while (!inventory.unlock(inventory.getPassword())) { // Password match logic
                    continue;
                }
            }

            System.out.print("Command >> ");
            String commandLine = sc.nextLine(); // Gets user command.
            String[] command = commandLine.split(" "); // Seperates the user command into an array. Uses spaces to seperate words
            if (command[0].toLowerCase().equals("quit")) { // If user inputs "quit", stop asking for user input.
                break;
            }

            // System.out.println(Arrays.toString(command));
            if (command[0].toLowerCase().equals("display") || command[0].toLowerCase().equals("inventory")) {
                System.out.println(inventory.toString()); // Displays user name, inventory, and inventory size
                continue;
            }

            if (command[0].toLowerCase().equals("clear")) { // Clears inventory
                inventory.getInventory().clear();
                continue;
            }

            if (command[0].toLowerCase().equals("lock")) { // Locks inventory if user has a password. Otherwise asks user to get a password if they want to lock.
                inventory.lock();
                continue;
            }

            inventory.edit(command[0], command[1], Integer.parseInt(command[2]), Integer.parseInt(command[3])); // Includes add, remove, and replace commands
        }

        System.out.println(inventory); // After user is done with commands, displays the final inventory
        sc.close();

    }
}
