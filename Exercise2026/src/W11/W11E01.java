package W11;

import java.util.Locale;

// Why inheritance? Two classes written by copy and paste.
// The base fee went up from RM 5.00 to RM 6.00, but only ParcelE01 was updated.
// ExpressParcelE01 still has the old copy, so its fee is wrong.
// W11E02 removes the copied calculation; W11E06 adds the express surcharge with super.fee().
class ParcelE01 {
    String recipient;
    double weightKg;

    ParcelE01(String recipient, double weightKg) {
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    double fee() {
        return 6.00 + 2.00 * weightKg;              // new base fee: RM 6.00
    }
}

class ExpressParcelE01 {                            // a copy of ParcelE01 plus one field
    String recipient;
    double weightKg;
    int promisedHours;

    ExpressParcelE01(String recipient, double weightKg, int promisedHours) {
        this.recipient = recipient;
        this.weightKg = weightKg;
        this.promisedHours = promisedHours;
    }

    double fee() {
        return 5.00 + 2.00 * weightKg + 8.00;       // old base fee: this copy was missed
    }
}

public class W11E01 {
    public static void main(String[] args) {
        ParcelE01 p = new ParcelE01("Aisyah", 1.2);
        ExpressParcelE01 e = new ExpressParcelE01("Ben", 1.2, 24);
        System.out.println("Parcel fee:  RM " + String.format(Locale.ROOT, "%.2f", p.fee()));
        System.out.println("Express fee: RM " + String.format(Locale.ROOT, "%.2f", e.fee()));
        System.out.println("Expected express fee: RM 16.40 (standard 8.40 + express 8.00)");
        // Try it: add a field 'delivered' to both classes. How many places must change?
    }
}
