
package W05;

import java.util.Random;

public class W05L06 {
    public static void main(String[] args) {    
        Random rand = new Random();

        int num = rand.nextInt(Integer.MAX_VALUE);
        int count = 1;

        for (int temp = num; temp >= 10; temp /= 10) {
            count++;
        }

        System.out.println("Random number: " + num);
        System.out.println("Number of digits: " + count);
    }
}
