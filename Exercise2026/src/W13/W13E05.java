package W13;

import java.util.Scanner;

// A retry loop: keep asking until the weight parses and is valid.
// The typed lines are fixed here (abc, -2, 1.5) so every run is the same;
// for real input, use new Scanner(System.in) and remove the echo line.
public class W13E05 {
    public static void main(String[] args) {
        double weight = 0;
        boolean ok = false;
        try (Scanner in = new Scanner("abc\n-2\n1.5\n")) {
            while (!ok) {
                System.out.print("Weight (kg): ");
                if (!in.hasNextLine()) {
                    break;                                   // end of input
                }
                String line = in.nextLine();
                System.out.println(line);                    // echo of the simulated typing
                try {
                    weight = Double.parseDouble(line);
                    ok = Double.isFinite(weight) && weight > 0;
                    if (!ok) {
                        System.out.println("  must be finite and greater than 0 kg, try again");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("  not a number, try again");
                }
            }
        }
        System.out.println(ok ? "Accepted: " + weight + " kg" : "No valid weight was typed");
    }
}
