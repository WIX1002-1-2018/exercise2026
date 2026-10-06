package W03;

import java.util.Scanner;

// Worked example: parcel postage by weight. Plan (IPO) first, then code, then test every boundary.
// Assumes the input is a number (W03E19 shows how to check it first).
// Input: weight in kg. Process: find the weight band. Output: postage in RM, two decimal places.
// Bands: up to 1 kg RM 8.00; up to 5 kg RM 12.50; up to 10 kg RM 18.00; over 10 kg not accepted.
public class W03E20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Weight (kg): ");
        double weight = in.nextDouble();
        if (weight <= 0) {
            System.out.println("Error: weight must be more than 0.");
        } else if (weight <= 1) {
            System.out.printf("Postage: RM %.2f%n", 8.00);
        } else if (weight <= 5) {
            System.out.printf("Postage: RM %.2f%n", 12.50);
        } else if (weight <= 10) {
            System.out.printf("Postage: RM %.2f%n", 18.00);
        } else {
            System.out.println("Error: parcels over 10 kg are not accepted.");
        }
        // Test: 0, 0.5, 1, 1.01, 5, 5.01, 10, 10.01
    }
}
