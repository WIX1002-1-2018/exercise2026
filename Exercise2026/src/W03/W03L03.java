/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;
import java.util.Random;
/**
 *
 * @author Faiz I
 */
public class W03L03 {
    public static void main(String[] args) {
        Random random = new Random();
        // Generate three random numbers between 10 and 50 (inclusive)
        int num1 = random.nextInt(41) + 10;
        int num2 = random.nextInt(41) + 10;
        int num3 = random.nextInt(41) + 10;

        // Calculate sum and average
        double sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println("Random Numbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", average);
    }
}


