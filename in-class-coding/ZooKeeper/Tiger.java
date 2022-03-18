package ZooKeeper;

public class Tiger extends Feline {
    
    public Tiger(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void huntAlone() {
        System.out.println("The Tiger hunt alone for it's next prey");
    }

    public void swim() {
        System.out.println("The Tiger swims across the body of water");
    }

}
