package W03;

import java.util.Scanner;

// Lab 2, question 2: monthly payment for a car loan (two decimal places).
// M = (P - D) * (1 + R * Y / 100) / (Y * 12), where P = price, D = down payment, R = interest rate in %, Y = years.
// Answer by Ethan (@ETHAN071104), PR #5. Test: P 50000, D 5000, R 3, Y 5 -> 862.50.
public class W03L02 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the price of the car (P): ");
        double p = keyboard.nextDouble();

        System.out.print("Enter the down payment (D): ");
        double d = keyboard.nextDouble();

        System.out.print("Enter the interest rate in % (R): ");
        double r = keyboard.nextDouble();

        System.out.print("Enter the loan duration in years (Y): ");
        double y = keyboard.nextDouble();

        double loan = p - d;                              // amount borrowed
        double m = loan * (1 + r * y / 100) / (y * 12);   // total with interest, shared over y * 12 months

        System.out.printf("Monthly payment: RM %.2f%n", m);
        keyboard.close();
    }
}
