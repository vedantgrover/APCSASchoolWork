package RPGPlayer;

public class Runner {
    public static void main(String[] args) {
        Wizard w = new Wizard("Scoot", 30, 4, "pastry");

        // once you have Wizard and Fighter made, test out your code on two
        // new Player subclass objects, one Wizard and one Fighter.
        // don't create a 'new Player()', create 'new Wizard()' and 'new Fighter()'

        Fighter f = new Fighter("Franc", 40, 6, "baguette");

        w.attack();
        w.charge();
        w.attack();

        f.recover();
    }
}
