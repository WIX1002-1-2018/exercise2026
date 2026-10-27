
package W04;
import java.util.Random;
public class W04L02 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6);
        String result = "";
        switch (num){
            case 0 -> result = "0 is zero";
            case 1 -> result = "1 is one";
            case 2 -> result = "2 is two";
            case 3 -> result = "3 is three";
            case 4 -> result = "4 is four";
            case 5 -> result = "5 is five";
        }
        System.out.print(num + " is " + result);
    }
}
