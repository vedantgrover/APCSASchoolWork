public class Test {
    public static void main(String[] args) {
        // mystery(10);
        // mystery2(6);
    }

    /*
     * This method will print "I am [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] years old." and
     * return 10. Each of the numbers within the array will have it's own print
     * statement. Ex. "I am 0 years old." "I am 1 years old." "I am 2 years old."...
     */
    public static int mystery(int i) {
        if (i == 0) {
            return 0;
        } else {
            System.out.println("I am " + mystery(i - 1) + " years old.");
            return i;
        }
    }

    /* 
    This method will return 720.
    */
    public static int mystery2(int i) {
        if (i <= 1) {
            return 1;
        } else {
            return (i * mystery2(i - 1));
        }
    }

    /* 
    This method will return 2.
    */
    public static int mystery3(int i, int j) {
        if (i == j)
            return i;
        else {
            if (j > i)
                return mystery3(i, j - i);
            else
                return mystery3(i - j, j);
        }
    }

    /* 
    
    */
    public static int mystery4(int[] x, int n) {
        int t;
        if (n == 1)
            return x[0];
        else {
            t = mystery4(x, n - 1);
            if (x[n - 1] > t)
                return x[n - 1];
            else
                return t;
        }
    }
}
