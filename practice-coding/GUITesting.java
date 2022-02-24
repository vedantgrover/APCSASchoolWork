import javax.swing.JFrame;

public class GUITesting {
    public static void main(String[] args) {
      JFrame frame = new JFrame();

      System.out.println("Launching new Program...");

      frame.setVisible(true);
      frame.setSize(512, 512);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
