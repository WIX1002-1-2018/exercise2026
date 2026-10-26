
package W04;
import java.util.Random;
public class W04L02 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6);
        String result = "";
        switch (num){
            case 0 -> result = "zero";
            case 1 -> result = "one";
            case 2 -> result = "two";
            case 3 -> result = "three";
            case 4 -> result = "four";
            case 5 -> result = "five";
        }
        System.out.print(num + " is " + result);
    }
}