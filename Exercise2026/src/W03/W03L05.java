package W03;

import java.util.Random;

// Lab 2, question 5: one random number from 0 to 10000, and the sum of all its digits.
// Only / and % are needed: a number up to 10000 has at most five digits.
// Answer by Mahjabin (@MarziaMahjabin), PR #18. Example: 1931 -> 1 + 9 + 3 + 1 = 14.
public class W03L05 {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(10001);                 // 0 to 10000 (10001 is not included)

        int digit1 = number / 10000;                      // ten-thousands digit
        int digit2 = (number / 1000) % 10;                // thousands digit
        int digit3 = (number / 100) % 10;                 // hundreds digit
        int digit4 = (number / 10) % 10;                  // tens digit
        int digit5 = number % 10;                         // ones digit

        int sum = digit1 + digit2 + digit3 + digit4 + digit5;

        System.out.println("The random number is: " + number);
        System.out.println("The sum of all digits is: " + sum);
    }
}
