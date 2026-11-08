package W05;

import java.util.Scanner;

public class W05L07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter interest in %: ");
        double interest = input.nextDouble();

        System.out.print("Enter total number of month(s): ");
        int months = input.nextInt();

        // Calculate monthly interest rate
        double monthlyRate = interest / (12 * 100);

        // Calculate monthly payment
        double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));

        double balance = principal;
        double totalInterest = 0;

        // Display table heading
        System.out.printf("%-8s%18s%15s%15s%18s%18s%n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        // Calculate each month's payment
        for (int n = 1; n <= months; n++) {

            double principalPaid = monthlyPayment * Math.pow(1 + monthlyRate, -(1 + months - n));

            double interestPaid = monthlyPayment - principalPaid;

            balance -= principalPaid;

            totalInterest += interestPaid;

            if (n == months) {
                balance = 0;
            }

            System.out.printf("%-8d%18.2f%15.2f%15.2f%18.2f%18.2f%n", n, monthlyPayment, principalPaid, interestPaid, balance, totalInterest);
        }

        input.close();
    }
}
