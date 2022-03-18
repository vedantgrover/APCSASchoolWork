package ZooKeeper;

public class Gorilla extends Primate {

  public Gorilla(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
  }

  public void grunt() {
    System.out.println("The gorilla grunts.");
  }
}