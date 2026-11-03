package W13;

import java.util.Scanner;

// Try it answer for video #65 (try it yourself first): ask for a quiz mark until it is a whole number
// from 0 to 100. The typed lines are fixed (eighty, 101, 92) so every run is the same.
public class W13E26 {
    public static void main(String[] args) {
        int mark = -1;
        boolean ok = false;
        try (Scanner in = new Scanner("eighty\n101\n92\n")) {
            while (!ok) {
                System.out.print("Mark: ");
                if (!in.hasNextLine()) {
                    break;
                }
                String line = in.nextLine();
                System.out.println(line);                    // echo of the simulated typing
                try {
                    mark = Integer.parseInt(line);
                    ok = mark >= 0 && mark <= 100;
                    if (!ok) {
                        System.out.println("  must be from 0 to 100, try again");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("  not a whole number, try again");
                }
            }
        }
        System.out.println(ok ? "Accepted: " + mark : "No valid mark was typed");
    }
}
