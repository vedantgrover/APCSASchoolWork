package ZooKeeper;

public class Penguin extends Birds {
    
    public Penguin(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly nerd");
    }

    public void fish() {
        System.out.println("The Penguin Fishes for fish");
    }

}
