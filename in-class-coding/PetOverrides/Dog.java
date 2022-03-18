package PetOverrides;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("out walking");
    }

    public void slobber() {
        System.out.println("Such a slobberpup");
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof woof woof!");
    }
}
