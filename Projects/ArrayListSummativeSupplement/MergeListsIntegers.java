import java.util.ArrayList;

public class MergeListsIntegers {
    /**
     * This method merges two ArrayList<Integers> by creating a new ArrayList that
     * is
     * procedurally constructed by adding the lesser of two elements in an
     * ArrayList.
     * 
     * Precondition: Both ArrayLists are already sorted from lowest to highest
     * 
     * @param list1 ArrayList<Integer> already sorted low to high
     * @param list2 ArrayList<Integer> already sorted low to high
     * @return ArrayList<Integer> that is the merged and sorted of the two input
     *         ArrayLists
     */
    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for (Integer num : list1) {
            newArr.add(num);
        }
        
        for (Integer num : list2) {
            newArr.add(num);
        }

        return sort(newArr);
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> arrList) {
        ArrayList<Integer> newArr = new ArrayList<Integer>(); // New ArrayList we will be returning

        for (int i = 0; i < arrList.size(); i++) {
            /*
             * If current value in arraylist is equal to minimum value, then remove it from
             * the arraylist and add it to the
             * new arraylist. Recheck that spot for the next iteration.
             */
            if (arrList.get(i) == min(arrList)) {
                newArr.add(arrList.remove(i)); // Remove from arraylist and add to new arraylist.
                i--; // Recheck value.
            } else {
                arrList.add(arrList.remove(i)); // Otherwise add the current value to the end of the arraylist.
                i--; // Recheck value
            }
        }

        return newArr;
    }

    public static int min(ArrayList<Integer> arrList) {
        int minimum = arrList.get(0);
        for (Integer num : arrList) {
            if (num < minimum) {
                minimum = num;
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<Integer>();
        ArrayList<Integer> listTwo = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            listOne.add((int) (Math.random() * 10 - i) + 1);
            listTwo.add((int) (Math.random() * 10 - i) + 1);
        }

        System.out.println(listOne);
        System.out.println(listTwo);
        System.out.println(mergeLists(listOne, listTwo));
    }
}