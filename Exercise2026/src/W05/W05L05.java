package W05;

import java.util.Random;

/* Write a simple two players dice game. Each player will take turns to roll a dice. The
first players that reach more than 100 points win the game. If the player rolls a 6, the
player will score 6 points and has the chance to roll again */
public class W05L05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int player1 = 0, player2 = 0;
        int dice = 0;
        final int winScore = 100;
        game:
        while ((player1 <= winScore) && (player2 <= winScore)) {
            do {
                System.out.println("Player 1 rolls a dice");
                dice = rand.nextInt(1, 7);
                player1 += dice;
                System.out.println("Player 1 rolled a " + dice + " (Current points: " + player1 + ")");
                if (player1>winScore) {
                    System.out.print("Player 1 wins with " + player1 + " points");
                    break game;
                }
            }
            while(dice==6);

            do {
                System.out.println("Player 2 rolls a dice");
                dice = rand.nextInt(1, 7);
                player2 += dice;
                System.out.println("Player 2 rolled a " + dice + " (Current points: " + player2 + ")");
                if (player2>winScore) {
                    System.out.print("Player 2 wins with " + player2 + " points");
                    break game;
                }
            }
            while (dice==6);
        }
        
       
    }
    
}
