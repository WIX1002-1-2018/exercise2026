
package W04;
import java.util.Random;
public class W04L04 {
    public static void main(String[] args) {
        Random random = new Random();
        int p1Roll1 = random.nextInt(6) + 1; 
        int p1Roll2 = random.nextInt(6) + 1;
        int player1Score = p1Roll1 + p1Roll2;
        System.out.println("Player 1 rolled: " + p1Roll1 + " and " + p1Roll2 + " (Total Score = " + player1Score + ")");

        int p2Roll1 = random.nextInt(6) + 1;
        int p2Roll2 = random.nextInt(6) + 1;
        int player2Score = p2Roll1 + p2Roll2;
        System.out.println("Player 2 rolled: " + p2Roll1 + " and " + p2Roll2 + " (Total Score = " + player2Score + ")");
        
        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}