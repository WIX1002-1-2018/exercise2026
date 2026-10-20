package W03;

import java.util.Scanner;

// Lab 2, question 6: energy needed to heat water, Q = M * (final temperature - initial temperature) * 4184.
// The formula uses M in kg and temperatures in degree Celsius; the lab sample asks for grams and Fahrenheit,
// so the program converts them first. Answer by Firhan (@Firharish21), PR #6.
// Lab sample: 55500, 38.3, 50.9 -> 1.625484e+06 joules.
public class W03L06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        double gram = input.nextDouble();

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialFahrenheit = input.nextDouble();

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalFahrenheit = input.nextDouble();

        double m = gram / 1000;                                       // grams to kg
        double initialCelsius = (initialFahrenheit - 32) / 1.8;       // Fahrenheit to Celsius
        double finalCelsius = (finalFahrenheit - 32) / 1.8;

        double q = m * (finalCelsius - initialCelsius) * 4184;        // energy in joules

        System.out.printf("The energy needed is %e%n", q);            // %e: scientific notation, as in the sample
        input.close();
    }
}
