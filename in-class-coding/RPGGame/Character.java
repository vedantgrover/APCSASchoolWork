package RPGGame;

public class Character {
    protected String name;
    protected int health;
    protected int level;
    protected int attackVal;
    protected String woc;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
        this.health = 3 * this.level;
        this.attackVal = this.level;
        woc = "fist";
    }

    public void attackTarget(Character target) {
        System.out.println(this.name + " attacks " + target.name + " with their " + woc.toLowerCase());
    }

    public void takeDamage(int pts) {
        health -= pts;
    }
}
