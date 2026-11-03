package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

// Never trust the data in a file: check each record before using it.
// A line that is not "day,steps,km" with sensible numbers is reported and skipped.
public class W09E09 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream("daily_log2.csv"));
        out.println("date,steps,km");
        out.println("Mon,8200,5.9");
        out.println("Tue,abc,7.4");                      // steps is not a number
        out.println("Wed,6400");                         // a field is missing
        out.println("Thu,9999999999,6.0");               // too big for an int
        out.println("Fri,9100,6.5");
        out.close();

        Scanner in = new Scanner(new File("daily_log2.csv"));
        if (in.hasNextLine()) {
            in.nextLine();                               // skip the header
        }
        int lineNo = 1, totalSteps = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            lineNo++;
            String[] part = line.split(",", -1);         // -1 keeps empty fields
            if (part.length != 3 || part[0].isBlank() || !isSteps(part[1]) || !isKm(part[2])) {
                System.out.println("Line " + lineNo + " skipped: " + line);
                continue;
            }
            totalSteps += Integer.parseInt(part[1].trim());
        }
        in.close();
        System.out.println("Total steps of the good lines: " + totalSteps);
    }

    // steps must be ONE whole number from 0 to 100000 and nothing else
    static boolean isSteps(String text) {
        try (Scanner s = new Scanner(text.trim()).useLocale(Locale.ROOT)) {
            if (!s.hasNextInt()) {                       // false for "abc" and for numbers too big for an int
                return false;
            }
            int steps = s.nextInt();
            return !s.hasNext() && steps >= 0 && steps <= 100000;   // !s.hasNext(): no extra words such as "8200 junk"
        }
    }

    // km must be ONE number from 0 to 100 (a dot as the decimal point, whatever the computer's language)
    static boolean isKm(String text) {
        try (Scanner s = new Scanner(text.trim()).useLocale(Locale.ROOT)) {
            if (!s.hasNextDouble()) {
                return false;
            }
            double km = s.nextDouble();
            return !s.hasNext() && km >= 0 && km <= 100;
        }
    }
}
