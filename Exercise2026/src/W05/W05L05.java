package W05;

import java.util.Random;

public class W05L05 {
    public static void main(String[] args) {
        Random random = new Random();

        int player1Score = 0;
        int player2Score = 0;
        int currentPlayer = 1;

        while (player1Score <= 100 && player2Score <= 100) {

            int dice = random.nextInt(6) + 1;

            if (currentPlayer == 1) {
                player1Score += dice;

                System.out.println("Player 1 rolled: " + dice);
                System.out.println("Player 1 score: " + player1Score);

            } else {
                player2Score += dice;

                System.out.println("Player 2 rolled: " + dice);
                System.out.println("Player 2 score: " + player2Score);
            }

            if (player1Score > 100 || player2Score > 100) {
                break;
            }

            if (dice != 6) {
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            }
        }

        if (player1Score > 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
