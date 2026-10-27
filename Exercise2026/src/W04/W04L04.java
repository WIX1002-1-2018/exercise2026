import java.util.Random;
public class W04L04 {
    public static void main(String[] args){
        Random rand = new Random();
        int p1_1st = rand.nextInt(6) + 1;
        int p1_2nd = rand.nextInt(6) + 1;
        System.out.println("Player 1: " + p1_1st + " and " + p1_2nd);
        int p1 = p1_1st + p1_2nd;
        int p2_1st = rand.nextInt(6) + 1;
        int p2_2nd = rand.nextInt(6) + 1;
        int p2 = p2_1st + p2_2nd;
        System.out.println("Player 2: " + p2_1st + " and " + p2_2nd);
        if (p1 > p2){
            System.out.println("Player 1 wins!");
        }
        else if (p2 > p1){
            System.out.println("Player 2 wins!");
        }
        else{
            System.out.println("It's a tie!");
        }
    }


}
