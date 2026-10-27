package W04;

import java.util.Random;
public class W04L04 {
    public static void main(String[] args) {
        Random rd = new Random();
        int max = rd.nextInt(6);
        int roll1 = rd.nextInt(max)+1;
        int roll2 = rd.nextInt(max)+1;
        int player1 = roll1 + roll2;
        int roll3 = rd.nextInt(max)+1;
        int roll4 = rd.nextInt(max)+1;
        int player2 = roll3 + roll4;
        System.out.println("Player 1 rolled: "+roll1+" and "+roll2+" (Total score: "+player1+")");
        System.out.println("Player 2 rolled: "+roll3+" and "+roll4+" (Total score: "+player2+")");
        if(player1>player2)
            System.out.println("Player 1 wins");
        else if(player1<player2)
            System.out.println("Player 2 wins");
        else
            System.out.println("Tie");
    }
}