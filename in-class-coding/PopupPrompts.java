import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PopupPrompts {

    public static void main(String[] args) {
        int[][] vals = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        String entry;
        int row;
        int col;
        boolean quit = false;
        while (!quit) {
            entry = JOptionPane.showInputDialog(null, "Enter a row number >> ");
            row = Integer.parseInt(entry);
            entry = JOptionPane.showInputDialog(null, "Enter a col number >> ");
            col = Integer.parseInt(entry);
            JOptionPane.showMessageDialog(null, "The value in that cell is " + vals[row][col]);

            entry = JOptionPane.showInputDialog(null, "(s)how array, (q)uit, or anything else for play again");
            if (entry.toLowerCase().equals("s")) {
                String show = "Your array: \n\n";
                for (int[] i : vals) {
                    for (int j : i) {
                        show += j + "\t";
                    }
                    show += "\n";
                }
                JOptionPane.showMessageDialog(null, new JTextArea(show));
            } else if (entry.toLowerCase().equals("q")) {
                quit = true;
            }
        }
    }
}
