import java.awt.*;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;

class DemoPaint extends JFrame {

    Container canvas = getContentPane();
    static Dimension d = new Dimension(500, 500);

    public DemoPaint() {
        canvas.setSize(d);
        canvas.setBackground(new ColorUIResource(0, 173, 206));
        canvas.setLayout(new FlowLayout());
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        //g.drawLine(0, 0, 150, 150);
        g.setColor(new ColorUIResource(255, 206, 0));
        g.fillRect(0, 0, 140, 160);

        g.setColor(new ColorUIResource(0, 104, 12));
        int[] x = {100, 300, 350, 150};
        int[] y = {100, 160, 160, 160};
        g.drawPolygon(x, y, 4);
        
    }

    public static void main(String[] args) {
        DemoPaint frame = new DemoPaint();
        frame.setSize(d);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}