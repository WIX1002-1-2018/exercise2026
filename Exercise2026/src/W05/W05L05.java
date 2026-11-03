package W05;

/**
 *
 * @author huiling
 */
import java.util.Random;

public class W05L05 {
    public static void main(String[] args) {
        Random r = new Random();
        int point1 = 0, point2 = 0, round = 1;
        String winner = "";
        
        while (point1 <= 100 && point2 <= 100){
            System.out.println("Round " + round);
            
            //player1 roll
            int play = r.nextInt(0,7);
            point1 = point1 + play;
            System.out.println("Player1: " + play);
            System.out.println("Player1's current points: " + point1);
            if (play == 6){
                System.out.println("Roll again!");
                play = r.nextInt(0,7);
                point1 = point1 + play;
                System.out.println("Player1: " + play);
                System.out.println("Player1's current points: " + point1);
            }
            
            if (point1 > 100){
                winner = "Player1";
                break;
            }
            
            //player2 roll
            play = r.nextInt(0,7);
            point2 = point2 + play;
            System.out.println("Player2: " + play);
            System.out.println("Player2's current points: " + point2);
            if (play == 6){
                System.out.println("Roll again!");
                play = r.nextInt(0,7);
                point2 = point2 + play;
                System.out.println("Player2: " + play);
                System.out.println("Player2's current points: " + point2);
            }
            
            if (point2 > 100){
                winner = "Player2";
                break;
            }
            
            //newline and round
            System.out.println("");
            round++;
        }
        
        System.out.println("The winner is " + winner + "!!"); 
    }
}