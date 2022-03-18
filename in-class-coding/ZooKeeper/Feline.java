package ZooKeeper;

public class Feline extends Animal {
    
    public Feline(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void roar() {
        System.out.println("The Feline roars");
    }

    public void growl() {
        System.out.println("The Feline growls");
    }

}
