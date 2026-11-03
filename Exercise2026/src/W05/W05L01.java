package W05;

import java.util.Scanner;

public class W05L01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        // Count how many factors there are
        int factorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorCount++;
            }
        }

        int[] factors = new int[factorCount];

        // Fill the array 
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        // Print all factors
        System.out.print("The factors are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]);

            if (i < factors.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        scanner.close();
    }
}