package ZooKeeper;

public class Elephant extends Animal {
    
    public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void trumpet() {
        System.out.println("The Elephant trumpets");
    }

    public void forage() {
        System.out.println("The Elephant forages for food");
    }

}
