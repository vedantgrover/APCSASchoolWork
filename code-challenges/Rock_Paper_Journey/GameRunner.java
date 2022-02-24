package Rock_Paper_Journey;

public class GameRunner {
    public static void main(String[] args) {
        Player player1 = new Player("Ved", false);
        Player player2 = new Player("Blade", true);

        player1.setChoice();
        player2.setChoice();

        System.out.println(player2.getChoice());

        /**
         * Welcome. Game Description
         * 
         * Set the Choices for each Player
         * 
         */

        int p1Score = player1.getScore();
        int p2Score = player2.getScore();

        player1.compareTo(player1.getChoice());
        player2.compareTo(player2.getChoice());

        if(player1.getScore()>p1Score) {
            System.out.println("Player 1");
        } else if(player2.getScore()>p2Score) {
            System.out.println("Player 2");
        } else {
            System.out.println("The game is a tie");
        }

        System.out.println("Player 1 Score : " + player1.getScore());
        System.out.println("Player 2 Score : " + player2.getScore());
    }
}


