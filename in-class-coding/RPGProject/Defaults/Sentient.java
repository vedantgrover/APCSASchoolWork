package Defaults;

public class Sentient {
    protected String name;
    protected int health;
    protected int level;
    protected int attackVal;
    protected String woc;
    protected String type;

    public Sentient(String name, int level) {
        this.name = name;
        this.level = level;
        this.health = 5 * this.level;
        this.attackVal = this.level;
        woc = "fist";
        type = "not valuable";
    }

    public void attackTarget(Sentient target) {
        System.out.println("The being attacks another being.");
    }

    public void takeDamage(int pts) {
        health -= pts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttackVal() {
        return attackVal;
    }

    public void setAttackVal(int attackVal) {
        this.attackVal = attackVal;
    }

    public String getWoc() {
        return woc;
    }

    public void setWoc(String woc) {
        this.woc = woc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
