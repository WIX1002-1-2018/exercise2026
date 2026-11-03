package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

// Read simple comma-separated records (a CSV file without quotes): each line is date,steps,km.
// Skip the header line, split each line at the commas, and convert the parts to numbers.
public class W09E08 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream("daily_log.csv"));
        out.println("date,steps,km");
        out.println("Mon,8200,5.9");
        out.println("Tue,10300,7.4");
        out.println("Wed,6400,4.6");
        out.close();

        Scanner in = new Scanner(new File("daily_log.csv"));
        in.nextLine();                                   // skip the header
        int totalSteps = 0;
        double totalKm = 0;
        int days = 0;
        while (in.hasNextLine()) {
            String[] part = in.nextLine().split(",");    // "Mon,8200,5.9" -> 3 parts
            int steps = Integer.parseInt(part[1]);
            double km = Double.parseDouble(part[2]);
            totalSteps += steps;
            totalKm += km;
            days++;
            System.out.printf(Locale.ROOT, "%-4s %6d steps %5.1f km%n", part[0], steps, km);
        }
        in.close();
        System.out.printf(Locale.ROOT, "Total %6d steps %5.1f km in %d days%n", totalSteps, totalKm, days);
    }
}
