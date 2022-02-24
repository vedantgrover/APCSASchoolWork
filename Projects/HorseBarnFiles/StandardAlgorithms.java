import java.util.ArrayList;

public class StandardAlgorithms {

    /**
     * Finds all the times v is located in arr. Returns the number of times it found
     * v in arr.
     * 
     * @param arr - Array you want the code to look through
     * @param v   - Target you want the code to search for.
     * @return - The number of times v is found in x.
     */
    public static int getFrequency(int[] arr, int v) {
        int x = 0;
        for (int a : arr) {
            if (a == v)
                x++;
        }
        return x;
    }

    /**
     * Finds all the times v is located in arrList. Returns the number of times it
     * found
     * v in arr.
     * 
     * @param arrList - ArrayList you want the code to look through
     * @param v       - Target you want the code to search for.
     * @return - The number of times v is found in x.
     */
    public static int getFrequency(ArrayList<Integer> arrList, int v) {
        int x = 0;
        for (Integer a : arrList) {
            if (a == v) {
                x++;
            }
        }
        return x;
    }

    /**
     * Finds the smallest element in the array and returns it.
     * 
     * @param arr - Array you want to find the smallest element for.
     * @return - The smallest element in the array.
     */
    public static int getMin(int[] arr) {
        int y = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < y)
                y = arr[i];
        }
        return y;
    }

    /**
     * Finds the smallest element in the list and returns it.
     * 
     * @param arrList - ArrayList you want to find the smallest element for.
     * @return - The smallest element in the arraylist.
     */
    public static int getMin(ArrayList<Integer> arrList) {
        int y = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) < y)
                y = arrList.get(i);
        }
        return y;
    }

    /**
     * Finds the average of the array.
     * 
     * @param arr - Array you want to find the average for.
     * @return - Returns the average value
     */
    public static double getAverage(double[] arr) {
        double y = 0;
        for (double a : arr) {
            y += a;
        }
        return y / arr.length;
    }

    /**
     * Finds the average of the arrayList.
     * 
     * @param arrList - ArrayList you want to find the average for.
     * @return - Returns the average value
     */
    public static double getAverage(ArrayList<Integer> arrList) {
        double y = 0;
        for (Integer a : arrList) {
            y += a;
        }
        return y / arrList.size();
    }

    /**
     * Will return true if v is found in the array. Will return false otherwise
     * 
     * @param arr - Array you want to search through for v
     * @param v   - Target you want to search for in array
     * @return - True is target is found in array. False otherwise
     */
    public static boolean isThere(int[] arr, int v) {
        int x = 0;
        boolean b = false;
        while (!b && (x < arr.length)) {
            if (arr[x] == v)
                b = true;
            x++;
        }
        return b;
    }

    /**
     * Will return true if v is found in the arraylist. Will return false otherwise
     * 
     * @param arrList - ArrayList you want to search through for v
     * @param v   - Target you want to search for in arraylist
     * @return - True is target is found in arraylist. False otherwise
     */
    public static boolean isThere(ArrayList<Integer> arrList, int v) {
        int x = 0;
        boolean b = false;
        while (!b && (x < arrList.size())) {
            if (arrList.get(x) == v)
                b = true;
            x++;
        }
        return b;
    }

    /**
     * Returns the largest value in the array
     * 
     * @param arr - Array you want to look through
     * @return - largest value in the array.
     */
    public static int getGreatestValue(int[] arr) {
        int n = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > n)
                n = arr[i];
        }
        return n;
    }

    /**
     * Returns the largest value in the arrayList
     * 
     * @param arrList - ArrayList you want to look through
     * @return - largest value in the arraylist.
     */
    public static int getGreatestValue(ArrayList<Integer> arrList) {
        int n = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) > n)
                n = arrList.get(i);
        }
        return n;
    }

    /**
     * Flips the array backwards
     * 
     * @param arr - Array you want to flip
     * @return - Flipped array
     */
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;
        }
        return arr;
    }

    /**
     * Flips the arraylist backwards
     * 
     * @param arrList - Arraylist you want to flip
     * @return - Flipped arraylist
     */
    public static ArrayList<Integer> reverse(ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size() / 2; i++) {
            int a = arrList.get(i);
            arrList.set(i, arrList.get(arrList.size() - i - 1));
            arrList.set(arrList.size() - i - 1, a);
        }
        return arrList;
    }

    /**
     * Sum of all units in an array
     * 
     * @param arr - Array you want to sum
     * @return - Sum of all digits in the array
     */
    public static int sum(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x += arr[i];
        }
        return x;
    }

    /**
     * Sum of all units in an array
     * 
     * @param arr - Array you want to sum
     * @return - Sum of all digits in the array
     */
    public static int sum(ArrayList<Integer> arrList) {
        int x = 0;
        for (int i = 0; i < arrList.size(); i++) {
            x += arrList.get(i);
        }
        return x;
    }

    /**
     * 
     * @param arr
     * @return
     */
    public static int methodH(int[] arr) {
        int x = 0;
        int y = 0;
        int[] z = new int[getGreatestValue(arr) + 1]; // spoiler warning!
        for (int a : arr) {
            z[a]++;
            if (z[a] > x) {
                x = z[a];
                y = a;
            }
        }
        return y;
    }

    /**
     * For length of the array-1, run function and updated i value += 2.
     * Function sets int a to index of array @ [i], updates array index i value to
     * the index value one above, then lastly resets index at [i+1] to the
     * previously defined a value.
     * 
     * @param arr
     * @return
     */
    public static int[] methodI(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int a = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = a;
        }
        return arr;
    }

    public static ArrayList<Integer> methodI(ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            int a = arrList.get(i);
            arrList.set(i, arrList.get(i + 1));
            arrList.set(i + 1, a);
        }

        return arrList;
    }

    /**
     * Check if a certain condition b is met, then for int a over the length of arr,
     * if a is <= 0, set boolean b to false. Return b outside for loop.
     * 
     * @param arr
     * @return
     */
    public static boolean methodJ(int[] arr) {
        boolean b = true;
        for (int a : arr) {
            if (a <= 0)
                b = false;
        }
        return b;
    }

    /**
     * 
     * 
     * @param arr
     * @return
     */
    public static int[] methodK(int[] arr) {
        for (int i = arr.length; i > 1; i--) {
            int a = arr[i - 2];
            arr[i - 2] = arr[i - 1];
            arr[i - 1] = a;
        }
        return arr;
    }

}
