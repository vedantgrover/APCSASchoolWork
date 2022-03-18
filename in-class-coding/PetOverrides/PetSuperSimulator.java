package PetOverrides;

public class PetSuperSimulator {
    public static void main(String[] args) {
        
        Dog beau = new Dog("Beau");
        Cat reeses = new Cat("Reeses");
        Pet frank = new Pet("Frank");

        reeses.feed();
        reeses.purr();

        beau.feed();
        beau.walk();

        beau.makeNoise();
        reeses.makeNoise();

        frank.makeNoise();
    }
}
