package ZooKeeper;

public class Monkey extends Primate {

  public Monkey(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
  }

  public void climb() {
    System.out.println("The monkey climbs.");
  }

  public void hoot() {
    System.out.println("The monkey hoots.");
  }

  public void howl() {
    System.out.println("The monkey howls.");
  }
}