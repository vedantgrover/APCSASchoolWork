package PetOverrides;

public class Bird extends Pet {
    
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.getName() + " flies around you excitedly");
    }

    @Override
    public void makeNoise() {
        System.out.println("SSCCCUUUAAAACCCKKKKK");
    }
}
