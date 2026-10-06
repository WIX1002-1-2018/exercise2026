package W03;

import java.util.Scanner;

// Try it answer for video #16 (try it yourself first): a battery message from a level of 0 to 100.
// Assumes a valid level. Test both sides of each boundary: 19 and 20, 49 and 50.
public class W03E24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Battery (0 to 100): ");
        int level = in.nextInt();
        if (level >= 50) {
            System.out.println("Battery OK");
        } else if (level >= 20) {
            System.out.println("Battery low");
        } else {
            System.out.println("Charge now");
        }
    }
}
