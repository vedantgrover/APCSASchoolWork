import java.util.ArrayList;

public class ArrayListTesting {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Hello");
        arrList.add("my");
        arrList.add("name");
        arrList.add("is");
        arrList.add("is");
        arrList.add("Vedant");

        System.out.println(arrList.size());
        arrList.remove("is");
        System.out.println(arrList.get(2));
        arrList.remove(4);
        arrList.add(2, "is");
        arrList.set(3, "is");
        System.out.println(arrList);
    }

}
