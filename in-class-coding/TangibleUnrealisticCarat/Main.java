package TangibleUnrealisticCarat;

public class Main {

    public static void main(String[] args) {
        
        Shape shape1 = new Shape(5,8,15);
        Shape shape2 = new Shape("Smellyagon", 4, 10, 0, true);
        Shape shape3 = new Shape(4,10,60);
        Shape shape4 = new Shape("Polylinear Scottagon", 5, 8, -40, true);
        Shape shape5 = new Shape("Thingamobaggin", 5, 8, -40, true);
        Shape shape6 = new Shape("Untitledamobaggin", 5, 8, -25, true);

        System.out.println(shape5.equals(shape6));
        System.out.println(shape5.equalsAlt(shape6));

    }
}