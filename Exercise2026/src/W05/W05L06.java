package W05;

/**
 *
 * @author huiling
 */
import java.util.Random;

public class W05L06 {
    public static void main(String[] args) {
        Random r = new Random();
        
        int n = r.nextInt(Integer.MAX_VALUE);
        String num = String.valueOf(n);
        int digit = num.length();
        
        System.out.println(n);
        System.out.println("Number of digits of the number: " + digit);
    }
}
