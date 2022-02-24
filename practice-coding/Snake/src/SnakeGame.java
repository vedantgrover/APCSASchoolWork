package Snake.src;

public class SnakeGame {
    private static GameFrame frame;

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        frame = new GameFrame();
    }

    public static void closeWindow() {
        frame.dispose();

    }
}
