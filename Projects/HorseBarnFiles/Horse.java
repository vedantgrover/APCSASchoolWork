/**
 * A Horse class to define a horses in a barn.
 */
public class Horse {
  private String name;
  private int weight;
  private int height;

  /**
   * The constructor for a horse. All horses require
   * a name and their weight.
   */
  public Horse(String n, int w, int h) {
    name = n;
    weight = w;
    setHeight(h);
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  /**
   * Gets the name of the horse.
   * 
   * @return the horse’s name
   */
  String getName() {
    return name;
  }

  /**
   * Gets the weight of the horse.
   * 
   * @return the horse’s weight
   */
  int getWeight() {
    return weight;
  }

  /**
   * Returns the name of the horse.
   * 
   * @return the horse's name
   */
  public String toString() {
    return name;
  }
}
