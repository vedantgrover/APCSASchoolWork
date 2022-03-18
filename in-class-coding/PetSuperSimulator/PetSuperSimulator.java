package PetSuperSimulator;

public class PetSuperSimulator {
    public static void main(String[] args) {
        Dog link = new Dog();
        link.setName("link");

        Dog Frey = new Dog();
        Frey.setName("Frey");

        Cat jessica = new Cat();
        jessica.setName("jessica");

        jessica.feed();
        jessica.purr();

        link.feed();
        link.walk();

        
    }
}
