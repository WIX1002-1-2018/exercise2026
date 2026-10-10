package W04;

import java.util.Scanner;

// Worked example: a bus card pays fares while the balance covers the fare.
// IPO. Input: card balance and fare (RM). Process: repeat "pay one fare" while balance >= fare.
// Output: each trip and the balance left, then the number of trips.
// Money is kept in sen (whole numbers) so repeated subtraction has no rounding drift.
// Assumes a balance of 0 or more with at most two decimal places (input checks: W04E08).
// Tests: 20 and 2.70 (7 trips), 5.40 and 2.70 (exactly 2 trips, RM 0.00 left), 2.69 and 2.70 (0 trips), fare 0 (rejected).
public class W04E17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Card balance (RM): ");
        int balance = (int) Math.round(in.nextDouble() * 100);
        System.out.print("Fare (RM): ");
        int fare = (int) Math.round(in.nextDouble() * 100);
        if (fare <= 0) {
            System.out.println("Error: the fare must be more than 0.");   // a fare of 0 would loop forever
        } else {
            int trips = 0;
            while (balance >= fare) {
                balance = balance - fare;
                trips++;
                System.out.printf("Trip %d: RM %.2f left%n", trips, balance / 100.0);
            }
            System.out.printf("%d trips. Top up needed: RM %.2f left%n", trips, balance / 100.0);
        }
        in.close();
    }
}
