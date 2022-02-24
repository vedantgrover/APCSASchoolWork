public class FunkyStringTeacherMethod {
    public static void main(String[] args) {
        String input = "Sandwiches";
        System.out.println(reverse(input));

        System.out.println(removeAlt(input));
      
    }

    public static String reverse(String input) {
        String revStr = "";
        for(int i = input.length(); i > 0; i--) {
            revStr+=input.substring(i-1, i);
        }
        return revStr;
    }

    public static String removeAlt(String str) {
        String halfStr = "";

        for(int i = 0; i < str.length(); i+=2) {
            halfStr += str.substring(i, i+1);
        }

        return halfStr;
    }
}
