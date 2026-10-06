package W03;

import java.util.Scanner;

// Check input before using it. hasNextInt() looks at the next token only: is it a number that fits in an int?
// It checks without consuming the token; nextInt() then reads it. Then if-else checks the range. Try abc, 2147483648, 150, -1 and 75.
// Note: "75 extra" is accepted, because only the first token is read.
public class W03E19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mark (0 to 100): ");
        if (!in.hasNextInt()) {
            System.out.println("Error: please enter a whole number.");
        } else {
            int mark = in.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Error: " + mark + " is out of range.");
            } else {
                System.out.println("Mark accepted: " + mark);
            }
        }
    }
}
