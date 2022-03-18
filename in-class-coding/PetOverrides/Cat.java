package PetOverrides;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    public void purr() {
        System.out.println("prrrrrrrrrrrr");
    }

    public void fitsAndSits() {
        System.out.println("That's a nice laptop--would be a shame if I sat onjfkdaljfdlkajda,");
    }
    
    @Override
    public void makeNoise() {
        System.out.println("MEOW, MEOW, RARRARARAR, MEOW, GRRRRRRR");
    }
}
