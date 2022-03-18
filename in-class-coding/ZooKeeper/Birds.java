package ZooKeeper;

public class Birds extends Animal {
    
    public Birds(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}
