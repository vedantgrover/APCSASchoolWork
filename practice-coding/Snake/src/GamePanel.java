package Snake.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600; // GUI Game Window Width
    static final int SCREEN_HEIGHT = 600; // GUI Game Window Height
    static final int UNIT_SIZE = 25; // Number the area is being divided by. This sets the size of the snake/apples. Bigger Numbers --> Bigger Snake Apple
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE; // Dividing the area to see how many gird squares there will be.
    static final int DELAY = 75;
    final int[] x = new int[GAME_UNITS]; // Makes all the possible x coordinates for the position of the snake and apples.
    final int[] y = new int[GAME_UNITS]; // Makes all the possible y coordinates for the position of the snake and apples.
    int bodyParts = 6; // Initializes size of the snake at the beginning.
    int applesEaten; // Score
    int appleX; // X coordinate of apple
    int appleY; // Y coordinate of apple
    char direction = 'R'; // Direction the snake has to turn in. Based off the answer keys.
    boolean running = false; // Checks to see if the game has begun running and is working.
    Timer timer;

    Random random; // Random Class variable that makes it easier to get a random number. (For apples)

    GamePanel() {
        random = new Random(); // Creating a new instance of a Random object.
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT)); // Setting the size of the GUI where the game will be played.
        this.setBackground(Color.BLACK); // Background color
        this.setFocusable(true); // Makes sure that the game is interactive. (This is what I found through testing)
        this.addKeyListener(new MyKeyAdapter()); // Key listeners for the key inputs from User.
        startGame();

    }
    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g) {

        if (running) {

            /*for (int i = 0; i < SCREEN_WIDTH/UNIT_SIZE; i++) {
                g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
            }*/
            g.setColor(Color.RED);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.GREEN);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(45, 180, 0));
                    //g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            // Score Text
            g.setColor(Color.WHITE);
            g.setFont(new Font("Calibri", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten))/2, g.getFont().getSize());
        } else {
            gameOver(g);
        }

    }
    public void newApple() {
        appleX = random.nextInt((int) (SCREEN_WIDTH/UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (SCREEN_HEIGHT/UNIT_SIZE)) * UNIT_SIZE;

    }
    public void move() {
        for(int i = bodyParts; i > 0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        switch (direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':
                x[0] = x[0] + UNIT_SIZE;
                break;
        }

    }
    public void checkApple() {
        if((x[0]==appleX) && (y[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }

    }
    public void checkCollisions() {
        // Checks if head collides with body
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }
        // Checks if head touches left border.
        if (x[0] < 0) {
            running = false;
        }
        // Checks if head touches right border.
        if (x[0] > SCREEN_WIDTH) {
            running = false;
        }
        // Checks if head touches top border
        if (y[0] < 0) {
            running = false;
        }
        // Checks if head touches bottom border
        if (y[0] > SCREEN_HEIGHT) {
            running = false;
        }

        if (!running) {
            timer.stop();
        }


    }
    public void gameOver(Graphics g) {
        // Game Over Score Text
        g.setColor(Color.WHITE);
        g.setFont(new Font("Calibri", Font.BOLD, 40));
        FontMetrics scoreMetrics = getFontMetrics(g.getFont());
        g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - scoreMetrics.stringWidth("Score: " + applesEaten))/2, g.getFont().getSize());
        // Game Over Text
        g.setColor(Color.RED);
        g.setFont(new Font("Calibri", Font.BOLD, 75));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH - metrics.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();

    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';

                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
                case KeyEvent.VK_ENTER:
                case KeyEvent.VK_SPACE:
                    SnakeGame.closeWindow();
                    SnakeGame.startGame();
                    System.out.println("Restarting");
                    break;
                case KeyEvent.VK_ESCAPE:
                    SnakeGame.closeWindow();
            }

        }
    }
}