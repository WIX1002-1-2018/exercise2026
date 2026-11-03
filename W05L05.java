
import java.util.Random;

public class main{
    public static void main(String[] args) {
        Random r = new Random();
        int p1, count1 = 0;
        int p2, count2 = 0;
        int s1 = 0;
        int s2 = 0;
        while (s1<=100 || s2<=100){
          p1 = r.nextInt(7);
          s1 += p1;
          if (s1>100){
            break;
          }
          while (p1 == 6){
            p1 = r.nextInt(7);
            s1 += p1;
            if (s1>100){
              break;
            }
          }
          p2 = r.nextInt(7);
          s2 += p2;
          if (s2>100){
            break;
          }
          while (p2 == 6){
            p2 = r.nextInt(7);
            s2 += p2;
            if (s2>100){
              break;
            }
          }
        }
        
        System.out.println("Player 1: "+ s1 + "\t" + "Player 2: " + s2);
        if (s1>s2){
          System.out.print("Player 1 wins. ");
        }
        else if (s1<s2){
          System.out.print("Player 2 wins. ");
        } else {
          System.out.print("Tie.");
        }


    }
}