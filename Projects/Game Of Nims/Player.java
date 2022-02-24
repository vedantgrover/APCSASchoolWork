import java.util.Scanner;

public class Player {

    private String name;
    private int id;

    private int score;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
        this.score = 0;
    }

    public Player() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name of Player : ");

        String input = sc.nextLine();

        this.name = input;
    }

    public Player(int id) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name of Player : ");

        String input = sc.nextLine();

        this.name = input;
        this.score = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void scoreUp(int value) {
        this.score += value;
    }

    public int getScore() {
        return this.score;
    }

}
