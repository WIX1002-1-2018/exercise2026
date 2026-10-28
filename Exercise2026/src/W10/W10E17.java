package W10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// Objects and files (Week 9): save each object as one CSV line, then build new objects from the lines.
// toCsv() turns a parcel into text; fromCsv(...) turns a line back into a parcel.
// (Simple CSV: the names have no commas. route.csv is made in the working folder and ignored by Git.)
// try (...) closes the file at the closing brace (try-with-resources, Week 9 W09E12).
class ParcelE17 {
    private final String trackingNo;
    private final String recipient;
    private final double weightKg;

    ParcelE17(String trackingNo, String recipient, double weightKg) {
        this.trackingNo = trackingNo;
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    String toCsv() {
        return trackingNo + "," + recipient + "," + weightKg;
    }

    static ParcelE17 fromCsv(String line) {         // a static method that makes an object
        String[] part = line.split(",");
        return new ParcelE17(part[0], part[1], Double.parseDouble(part[2]));
    }

    public String toString() {
        return trackingNo + " to " + recipient + ", " + weightKg + " kg";
    }
}

public class W10E17 {
    public static void main(String[] args) throws FileNotFoundException {
        ParcelE17[] route = {
            new ParcelE17("MY10001", "Aisyah", 1.2),
            new ParcelE17("MY10002", "Ben", 0.4),
            new ParcelE17("MY10003", "Chong", 3.5)
        };
        try (PrintWriter out = new PrintWriter("route.csv")) {
            for (ParcelE17 p : route) {
                out.println(p.toCsv());
            }
        }
        System.out.println("Saved " + route.length + " parcels to route.csv");

        ParcelE17[] loaded = new ParcelE17[route.length];
        int n = 0;
        try (Scanner in = new Scanner(new File("route.csv"))) {
            while (in.hasNextLine() && n < loaded.length) {
                loaded[n] = ParcelE17.fromCsv(in.nextLine());
                n++;
            }
        }
        System.out.println("Loaded " + n + " parcels:");
        for (int i = 0; i < n; i++) {
            System.out.println("  " + loaded[i]);
        }
    }
}
