package W05;

import java.util.Random;

public class W05L06 {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(Integer.MAX_VALUE);

        System.out.println("Random number: " + number);

        int temp = number;
        int count = 0;

        do {
            temp = temp / 10;
            count++;
        } while (temp != 0);

        System.out.println("Number of digits: " + count);
    }
}
