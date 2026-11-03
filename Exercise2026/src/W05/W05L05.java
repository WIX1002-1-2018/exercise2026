package W05;


import java.util.Scanner;

public class W05L05 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int player1Score = 0;
        int player2Score = 0;
        int currentPlayer = 1;

        System.out.println("=== Welcome to the Two-Player Dice Game ===");
        System.out.println("First player to reach strictly MORE than 100 points wins!");
        System.out.println("Roll a 6 to get an extra turn.\n");

        // Game continues until either player's score is strictly > 100
        while (player1Score <= 100 && player2Score <= 100) {
            System.out.println("----------------------------------------");
            System.out.println("Player " + currentPlayer + "'s turn!");
            System.out.print("Press ENTER to roll the dice...");
            keyboard.nextLine(); // Waits for player to hit Enter

            // Generate a random number from 1 to 6
            int roll = (int) (Math.random() * 6) + 1;
            System.out.println("Player " + currentPlayer + " rolled: " + roll);

            // Add roll to the current player's score
            if (currentPlayer == 1) {
                player1Score += roll;
                System.out.println("Player 1 Total Score: " + player1Score);
            } else {
                player2Score += roll;
                System.out.println("Player 2 Total Score: " + player2Score);
            }

            // Check if someone has won immediately after their roll
            if (player1Score > 100 || player2Score > 100) {
                break;
            }

            // Check for bonus roll or switch turns
            if (roll == 6) {
                System.out.println("Awesome! You rolled a 6, so you get to roll again!");
            } else {
                // Switch players: if 1 then become 2, if 2 then become 1
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            }
            System.out.println();
        }

        // Determine the winner
        System.out.println("\n========================================");
        if (player1Score > 100) {
            System.out.println("Player 1 WINS with " + player1Score + " points!");
        } else {
            System.out.println("Player 2 WINS with " + player2Score + " points!");
        }
        System.out.println("========================================");

        keyboard.close();
    }
}