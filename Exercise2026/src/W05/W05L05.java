package W05;
import java.util.Random;

public class W05L05 {
    static Random num = new Random();
    public static void main(String[] args){
        int p1_score = 0;
        int p2_score = 0;
        outer:
        while(true){
            System.out.println("Current score\nPlayer 1: " + p1_score + "\nPlayer 2: " + p2_score);
            for(int i = 1; i <= 2; i++){
                int roll;
                int totalRoll = 0;
                do{
                    roll = num.nextInt(6) + 1;
                    System.out.println("Player " + i + " rolls " + roll);
                    totalRoll += roll;
                    if (roll == 6){
                        System.out.println("Player " + i + " rolls again");
                    }
                    }while(roll == 6);
                if(i == 1){
                    p1_score += totalRoll;
                    if(p1_score > 100) break outer;
                }
                else{
                    p2_score += totalRoll;
                    if(p2_score > 100) break outer;
                }

            }
        }
        System.out.println("Final Score\nPlayer 1 score: " + p1_score + "\nPlayer 2 score: " + p2_score);
        if(p1_score > p2_score){
            System.out.println("Player 1 wins");
        }else
        {
            System.out.println("Player 2 wins");
        }
    }
    
}

