import java.util.ArrayList;

public class MergeLists {
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
    public static ArrayList<Horse> mergeLists(ArrayList<Horse> list1, ArrayList<Horse> list2) {
        ArrayList<Horse> newArr = new ArrayList<Horse>();

        for (Horse h : list1) {
            newArr.add(h);
        }
        
        for (Horse h : list2) {
            newArr.add(h);
        }

        return sort(newArr);
    }

    public static ArrayList<Horse> sort(ArrayList<Horse> arrList) {
        ArrayList<Horse> newArr = new ArrayList<Horse>(); // New ArrayList we will be returning

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

    public static Horse min(ArrayList<Horse> arrList) {
        int minimum = arrList.get(0).getHeight();
        for (Horse h : arrList) {
            if (h.getHeight() < minimum) {
                minimum = h.getHeight();
            }
        }

        for (Horse h : arrList) {
            if (h.getHeight() == minimum) {
                return h;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ArrayList<Horse> listOne = new ArrayList<Horse>();
        ArrayList<Horse> listTwo = new ArrayList<Horse>();

        listOne.add(new Horse("Cheese", 1234, 34));
        listOne.add(new Horse("Epona", 4324, 23));
        listOne.add(new Horse("Shorty", 1265, 10));
        listOne.add(new Horse("Jasper", 4321, 35));

        listTwo.add(new Horse("Gasper", 5424, 123));
        listTwo.add(new Horse("Lepona", 1342, 67));
        listTwo.add(new Horse("Shortery", 1342, 9));
        listTwo.add(new Horse("Talli", 1432, 54));

        System.out.println(listOne);
        System.out.println(listTwo);
        System.out.println(mergeLists(listOne, listTwo));
    }
}