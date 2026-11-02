package W05;

import java.util.Scanner;

public class W05L03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        double sum = 0;
        double sumSquare = 0;

        while (true) {
            System.out.print("Enter a score [negative score to quit]: ");
            score = input.nextInt();

            if (score < 0) {
                break;
            }

            count++;

            sum += score;
            sumSquare += score * score;

            if (score < min) {
                min = score;
            }

            if (score > max) {
                max = score;
            }
        }

        if (count > 0) {
            double average = sum / count;

            double standardDeviation = Math.sqrt(
                (sumSquare - (sum * sum) / count) / (count - 1)
            );

            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f%n", average);
            
            if (count > 1) {
                System.out.printf("Standard Deviation: %.2f%n", standardDeviation);
            } else {
                System.out.println("Standard Deviation: Not available");
            }
        } else {
            System.out.println("No scores were entered.");
        }

        input.close();
    }
}
