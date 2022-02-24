import java.util.ArrayList;

public class ArrayListBreaking {
    public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<Integer>();

      arr.add(4);
      arr.add(2);
      arr.add(7);
      System.out.println(arr.set(2, 5));
    }
}
