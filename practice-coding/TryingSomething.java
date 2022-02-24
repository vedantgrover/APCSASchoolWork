public class TryingSomething {
    public static void main(String[] args) {
      String str = "Hello 12";

      String substring = str.substring(str.toLowerCase().indexOf("h"), str.toLowerCase().indexOf(" "));
      System.out.println(substring);

      String replaceStr = "I want to deposit 5";
      String someResponse = replaceStr.toLowerCase().substring(0, replaceStr.toLowerCase().indexOf("it ") + 3);
      String response = replaceStr.toLowerCase().replace(someResponse, "");

      System.out.println(someResponse);

      int value = Integer.valueOf(response);

      System.out.println(value);

    }
    
}
