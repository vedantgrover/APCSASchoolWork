package RPGPlayer;


public class Wizard extends Player {

    public Wizard(String name, int hp, int att, String woc) {
        super(name, hp, att, woc);
    }

    public void charge() {
        this.setAtt(getAtt() + 2);
        System.out.println(getName() + " super charges their attack to " + getAtt() + " pts");
    }
}
