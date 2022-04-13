import javax.management.modelmbean.DescriptorSupport;

public class ProgressCheckTesting {

  public static String messageId;
  public static String description;

  public static void main(String[] args) {
    String message = "SERVER1:file not found";

    try {
      String[] logM = message.split(":");
      messageId = logM[0];
      description = logM[1];

      System.out.println(message);
      System.out.println(messageId);
      System.out.println(description);
    } catch (Exception e) {
      System.out.println("Incorrect Message Format");
    }

    System.out.println(description.substring(description.indexOf("not") - 1, description.indexOf("not")).equals(" "));
  }

}
