package ZooKeeper;

public class Lion extends Feline {
    
    public Lion(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void huntInPack() {
        System.out.println("The Lion and it's buddies hunt together for their next prey");
    }
}
