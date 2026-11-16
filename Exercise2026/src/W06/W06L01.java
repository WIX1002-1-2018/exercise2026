/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class W06L01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of students (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }

        int[] scores = new int[n];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = rand.nextInt(101); 
        }

        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("\n--- Student Scores Report ---");
        System.out.println("List of scores: " + Arrays.toString(scores));
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score : " + lowest);
        System.out.printf("Average score: %.2f\n", average);

        scanner.close();
    }
}