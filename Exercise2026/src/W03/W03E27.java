package W03;

import java.util.Scanner;

// Try it answer for video #19 (try it yourself first): bus fare by distance, with safe input.
// Bands: up to 5 km RM 1.00; up to 15 km RM 2.50; over 15 km RM 4.00. Test 0, 5, 5.1, 15, 15.1, abc and NaN.
public class W03E27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Distance (km): ");
        if (!in.hasNextDouble()) {
            System.out.println("Error: please enter a number.");
        } else {
            double km = in.nextDouble();
            if (!Double.isFinite(km)) {                 // hasNextDouble also accepts NaN and Infinity
                System.out.println("Error: distance must be a real number.");
            } else if (km <= 0) {
                System.out.println("Error: distance must be more than 0.");
            } else if (km <= 5) {
                System.out.printf("Fare: RM %.2f%n", 1.00);
            } else if (km <= 15) {
                System.out.printf("Fare: RM %.2f%n", 2.50);
            } else {
                System.out.printf("Fare: RM %.2f%n", 4.00);
            }
        }
    }
}
