package BigO;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMaker {
    private static ArrayList<Integer> list;

    public static ArrayList<Integer> getArray() {
        list = new ArrayList<Integer>();
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\in-class-coding\\BigO\\values.txt"));
            while (sc.hasNextLine()) {
                list.add(Integer.parseInt(sc.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("file error : " + e);
        }
        return list;
    }

}
