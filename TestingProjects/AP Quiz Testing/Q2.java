public class Q2 {
    public static void main(String[] args) {
        System.out.println(mystery("computer"));
    }

    public static String mystery(String str) {
        String output = "";

        for (int k = 1; k < str.length(); k = k + 2) {
            output += str.substring(k, k + 1);
        }

        return output;
    }

}
