package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

// Worked example: an expense tracker that remembers expenses between runs.
// Input: an expense (item and amount). Process: append it to expenses.csv, then read all lines.
// To start again, delete expenses.csv.
// Output: every expense and the total. Run it a few times with different expenses.
public class W09E24 {
    static final String FILE = "expenses.csv";

    static void addExpense(String item, double amount) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(new FileOutputStream(FILE, true))) {   // append
            out.printf(Locale.ROOT, "%s,%.2f%n", item, amount);   // always a dot: 2.50, never 2,50
        }
    }

    // a real amount from 0.01 to 10000 (rejects NaN and Infinity); it is saved with 2 decimal places
    static boolean validAmount(double amount) {
        return Double.isFinite(amount) && amount >= 0.01 && amount <= 10000;
    }

    // one amount in the file, written with a dot, and nothing else on that field
    static boolean isAmount(String text) {
        try (Scanner s = new Scanner(text.trim()).useLocale(Locale.ROOT)) {
            if (!s.hasNextDouble()) {
                return false;
            }
            double amount = s.nextDouble();
            return !s.hasNext() && validAmount(amount);
        }
    }

    static double showAll() throws FileNotFoundException {
        double total = 0;
        try (Scanner in = new Scanner(new File(FILE))) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] part = line.split(",", -1);
                if (part.length != 2 || !isAmount(part[1])) {
                    System.out.println("Skipped a damaged line: " + line);
                    continue;
                }
                double amount = Double.parseDouble(part[1]);
                total += amount;
                System.out.printf(Locale.ROOT, "%-14s RM %7.2f%n", part[0], amount);
            }
        }
        return total;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(System.in).useLocale(Locale.ROOT);   // read 2.50 with a dot on every computer
        System.out.print("Item: ");
        String item = kb.nextLine().replace(",", " ").trim();    // a comma would break the line
        System.out.print("Amount (RM): ");
        if (!kb.hasNextDouble()) {
            System.out.println("Please enter a number such as 2.50.");
            kb.close();
            return;
        }
        double amount = kb.nextDouble();
        kb.close();
        if (item.isEmpty() || !validAmount(amount)) {
            System.out.println("Enter an item name and an amount from 0.01 to 10000.");
            return;
        }
        addExpense(item, amount);
        double total = showAll();
        System.out.printf(Locale.ROOT, "%-14s RM %7.2f%n", "Total", total);
    }
}
