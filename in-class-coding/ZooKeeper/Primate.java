package ZooKeeper;

public class Primate extends Animal {

  public Primate(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
  }

  public void forage() {
    System.out.println("The primate forages for food.");
  }
}