package RPGPlayer;


public class Fighter extends Player {

    public Fighter(String name, int hp, int att, String woc) {
        super(name, hp, att, woc);
    }

    public void recover() {
        this.setHP(getHP() + 3);
        System.out.println(getName() + " recovers 3 hp. They are at " + getHP() + " HP");
    }
}
