package W05;

import java.util.Random;

public class W05L08 {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(101);

        System.out.println("n = " + n);
        System.out.println("The first " + n + " prime numbers are:");

        int count = 0;
        int number = 2;

        while (count < n) {

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }
    }
}