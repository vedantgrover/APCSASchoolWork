package BigO;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchEx {

    public static ArrayList<Integer> list;
    public static void main(String[] args) {
        list = ArrayMaker.getArray();
        //System.out.println(list);

        sequentialSearch();
        binarySearch();
    }

    public static void sequentialSearch() {
        System.out.print("Enter an integer between 1 and 30169 to see if and where it is in the list \n>> ");
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        double time0 = System.nanoTime()/1000; // start time in microseconds
        boolean found = false;
        int index = 0;
        while (!found && index<list.size()) {
            if (input == list.get(index)) {
                found=true;
                System.out.println(input + " found!");
            }
            index++;
        }
        if (!found) System.out.println(input + " not found :(");
        double time1 = System.nanoTime()/1000; // end time in microseconds
        System.out.println("Operation completed in : " + (time1-time0) + " microseconds.");
    }

    public static void binarySearch() {
        System.out.print("Enter an integer between 1 and 30169 to see if and where it is in the list \n>> ");
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        double time0 = System.nanoTime()/1000; // start time in microseconds
        boolean found = false;

        ArrayList<Integer> searchList = list;

        while (!found && searchList.size()>0) {
            int midIndex = searchList.size()/2;
            if (searchList.size()==1 && !(searchList.get(0)==input)) {
                searchList.remove(0);
            }
            else if (input==searchList.get(midIndex)) found = true;
            else if (input > searchList.get(midIndex)) {
                searchList = new ArrayList<Integer>(searchList.subList(midIndex,searchList.size()));
            } else {
                searchList = new ArrayList<Integer>(searchList.subList(0, midIndex));
            }
            //System.out.println(searchList.size());
        }
        if (found) System.out.println(input + " found!");
        else System.out.println(input + " not found :(");
        double time1 = System.nanoTime()/1000; // end time in microseconds
        System.out.println("Operation completed in : " + (time1-time0) + " microseconds.");
    }
}
