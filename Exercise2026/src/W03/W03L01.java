package W03;

import java.util.Scanner;

// Lab 2, question 1: convert a temperature in degree Fahrenheit to degree Celsius (two decimal places).
// Formula: Celsius = (Fahrenheit - 32) / 1.8. Answer by Ethan (@ETHAN071104), PR #5. Test: 212 -> 100.00, 98.6 -> 37.00.
public class W03L01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = keyboard.nextDouble();       // double: the input may have decimals

        double celsius = (fahrenheit - 32) / 1.8;        // brackets first, then divide

        System.out.printf("Temperature in Celsius: %.2f deg C%n", celsius);   // %.2f: two decimal places
        keyboard.close();
    }
}
