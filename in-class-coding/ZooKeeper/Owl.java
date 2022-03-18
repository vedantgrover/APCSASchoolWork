package ZooKeeper;

public class Owl extends Birds {
    
    public Owl(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void hunt() {
        System.out.println("The owl hunts for prey");
    }

}
