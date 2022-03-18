package RPGPlayer;


public class Player {

    private String name;
    private int hp;
    private int att;
    private String woc; // weapon of choice

    public Player(String name, int hp, int att, String woc) {
        this.name = name;
        this.hp = hp;
        this.att = att;
        this.woc = woc;
    }

    // Methods!

    public void attack() {
        System.out.println(name + " attacks with their " + woc + " for " + att + " damage!");
    }

    public void takeDamage(int dam) {
        hp -= dam;
        System.out.println(name + "'s health is reduced by " + dam + " points. They have " + hp + " HP remaining.");
    }

    // ACCESSORS AND MUTATORS

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public int getAtt() {
        return att;
    }

    public String getWOC() {
        return woc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public void setWOC(String woc) {
        this.woc = woc;
    }
}
