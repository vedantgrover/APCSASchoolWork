package ZooKeeper;

public class ZooKeeperRunner {
  public static void main(String[] args) {
    Animal g = new Giraffe("Leaves", false, 20);

    Giraffe gir = (Giraffe) new Animal("Leaves", false, 20);
  }
}