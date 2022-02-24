package TangibleUnrealisticCarat;

public class Shape {

    //attributes
    private String name;
    private int sides;
    private int sideLength;
    private int rotation; // initial orientation
    private boolean spinning; // spinning counterclockwise or non-moving

    public Shape(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
        setName("unnamed");
        setRotation(0);
        setSpinning(false);
    }

    public Shape(String name, int sides, int sideLength) {
        this.name = name;
        this.sides = sides;
        this.sideLength = sideLength;
        setRotation(0);
        setSpinning(false);
    }
    
    public Shape(int sides, int sideLength, int rotation) {
        this.sides = sides;
        this.sideLength = sideLength;
        this.rotation = rotation;
        setName("unnamed");
        setSpinning(false);
    }

    public Shape(String name, int sides, int sideLength, int rotation, boolean spinning) {
        this.name = name;
        this.sides = sides;
        this.sideLength = sideLength;
        this.rotation = rotation;
        this.spinning = spinning;
    }

    public boolean equalsAlt(Shape shape) {
      int ourSides = this.sides;
      int thoseSides = shape.getSides();

      if (ourSides == thoseSides) {
        return true;
      } else return false;
    }

    // create equals() method here //

    public boolean equals(Shape shape) {
        return this.sides == shape.getSides();
    }

    // --------------------------- //

    // accessors and mutators
    // region
    public boolean getSpinning() {
        return spinning;
    }

    public void setSpinning(boolean spinning) {
        this.spinning = spinning;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // endregion

    public String toString() {
        String spinYesNo;
        if (spinning) spinYesNo = "";
        else spinYesNo = " not";
        String str = "The shape is named: " + name +
                    "\nIt has " + sides + " of length: " + sideLength +
                    "\nIt's initial angle is " + rotation + " degrees and it is" + spinYesNo + " spinning";
        return str;
    }
}
