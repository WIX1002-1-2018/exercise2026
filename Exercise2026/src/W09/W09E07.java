package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

// Read numbers from a file: hasNextInt() and nextInt() read the numbers one by one,
// whether they are on one line or on many lines.
public class W09E07 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream("week_steps.txt"));
        out.println("8200 6400 10300");
        out.println("7500 9100");
        out.println("12000 5600");
        out.close();

        Scanner in = new Scanner(new File("week_steps.txt"));
        int total = 0, days = 0, goalDays = 0;
        while (in.hasNextInt()) {                        // false at the end, or at a word that is not a whole number
            int steps = in.nextInt();
            total += steps;
            days++;
            if (steps >= 10000) {
                goalDays++;
            }
        }
        in.close();
        System.out.println("Days read:      " + days);
        System.out.println("Total steps:    " + total);
        System.out.println("Days >= 10000:  " + goalDays);
    }
}
