package Sorting;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Use this class to get the long list of data from the longList.csv file
 * 
 * Opening longList.csv in Excel will allow you to regenerate the list with different numbers
 * To regenerate, simply double-click in any cell, make no changes, and hit 'enter' on your
 * keyboard to escape. This act will reset the numbers.
 * 
 * Make sure to save your file while you exit. You cannot do this while longList.csv is open in 
 * another program. 
 */

public class SortingList {
    
    private static ArrayList<Integer> shortList;
    private static ArrayList<Integer> longList;

    public static ArrayList<Integer> getShortList() {
        shortList = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            shortList.add((int) (Math.random()*10)+5);
        }
        return shortList;
    }


    public static ArrayList<Integer> getLongList() {
        longList = new ArrayList<Integer>();
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\306972\\Desktop\\AP CSA\\vedantgrover\\code-challenges\\Sorting\\longList.csv"));
            while (sc.hasNextLine()) {
                longList.add(Integer.parseInt(sc.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("file error : " + e);
        }
        return longList;
    }
}
