package ZooKeeper;

public class Deer extends Hooved {

  public Deer(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
  }

  public void grunt() {
    System.out.println("The deer grunts.");
  }
}