import java.util.Scanner;

public class Game {

    private static Scanner sc = new Scanner(System.in);

    private static String[] characters = { "botanist", "b", "explorer", "e", "pilot", "pi", "professor", "pr", "wizard",
            "w" };

    private static String[] pickPlayer() {
        String[] result = new String[3]; // [NAME, LEVEL, AVATAR_TYPE]

        boolean valid = false;
        while (!valid) {
            System.out.println(
                    "Welcome new Player...to the Adventures of Outrule.\nTo start, please pick a character:\n ");
            System.out.println(
                    "\t(b)otanist\n\t(e)xplorer\n\t(pi)lot\n\t(pr)ofessor\n\t(w)izard\n\nFORMAT: <NAME> <LEVEL> <CHARACTER TYPE>\n");
            System.out.print("Your character >> ");
            result = sc.nextLine().split(" ");

            if (result[0].toLowerCase().equals("q") || result[0].toLowerCase().contains("quit")) {
                System.exit(0);
            } else if (result.length < 3) {
                System.out.println("We require more information.");
                continue;
            } else if (check(characters, result[2].toLowerCase())) {
                valid = true;
            } else {
                System.out.println("Your character type was not found. Please try again.");
            }
        }

        return result;
    }

    private static boolean check(String[] arr, String str) {
        for (String s : arr) {
            if (s.equals(str)) {
                return true;
            }
        }

        return false;
    }

    private static Character createCharacter(String[] info) {
        Botanist b = new Botanist(info[0], Integer.parseInt(info[1]));
        Explorer e = new Explorer(info[0], Integer.parseInt(info[1]));
        Pilot pi = new Pilot(info[0], Integer.parseInt(info[1]));
        Professor pr = new Professor(info[0], Integer.parseInt(info[1]));
        Wizard w = new Wizard(info[0], Integer.parseInt(info[1]));

        switch (info[2].toLowerCase()) {
            case "b":
            case "botanist":
                return b;
            case "e":
            case "explorer":
                return e;
            case "pi":
            case "pilot":
                return pi;
            case "pr":
            case "professor":
                return pr;
            case "w":
            case "wizard":
                return w;
            default:
                return null;
        }
    }

    private static void attackEncounter(Character atChar, Character tarChar) {
        atChar.attackTarget(tarChar);
        tarChar.takeDamage(atChar.attackVal);
    }

    public static void play() {
        
    }
}
