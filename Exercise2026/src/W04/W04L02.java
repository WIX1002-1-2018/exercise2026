package W04;
import java.util.Random;

public class W04L02 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(6);

        if (randomNumber==0) {
            System.out.printf("%d is zero", randomNumber);
        }
        else if (randomNumber==1) {
            System.out.printf("%d is one", randomNumber);
        }
        else if (randomNumber==2) {
            System.out.printf("%d is two", randomNumber);
        }
        else if (randomNumber==3) {
            System.out.printf("%d is three", randomNumber);
        }
        else if (randomNumber==4) {
            System.out.printf("%d is four", randomNumber);
        }
        else {
            System.out.printf("%d is five", randomNumber);
        }
    }
}