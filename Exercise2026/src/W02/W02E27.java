package W02;

import java.util.Scanner;

// Worked example: a BMI calculator from IPO to Java.
public class W02E27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Weight (kg): ");
        double weight = in.nextDouble();
        System.out.print("Height (m): ");
        double height = in.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("BMI = %.2f%n", bmi);
    }
}
