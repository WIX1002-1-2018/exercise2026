package W03;

import java.util.Random;

// Lab 2, question 3: three random numbers from 10 to 50, their sum and their average (two decimal places).
// Answer by Faiz (@faizmibadurrahman), PR #14.
public class W03L03 {
    public static void main(String[] args) {
        Random random = new Random();

        // nextInt(41) gives 0 to 40; adding 10 gives 10 to 50 (both ends included)
        int num1 = random.nextInt(41) + 10;
        int num2 = random.nextInt(41) + 10;
        int num3 = random.nextInt(41) + 10;

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;                       // 3.0, not 3: avoids integer division

        System.out.println("Random numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
    }
}
