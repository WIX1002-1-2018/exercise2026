package W04;

import java.util.Scanner;

// Input validation with do-while: keep asking until the input is valid (W03E19 asked only once).
// in.next() reads and throws away a token that is not a whole number, so the loop can ask again.
// Try with: abc 150 -1 75   (2147483648 is too big for an int, so it is not a valid int either)
public class W04E08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark = -1;
        boolean valid = false;
        do {
            System.out.print("Mark (0 to 100): ");
            if (in.hasNextInt()) {
                mark = in.nextInt();
                valid = mark >= 0 && mark <= 100;
                if (!valid) {
                    System.out.println("Error: " + mark + " is out of range.");
                }
            } else {
                System.out.println("Error: " + in.next() + " is not a valid int.");
            }
        } while (!valid);
        System.out.println("Mark accepted: " + mark);
        in.close();
    }
}
