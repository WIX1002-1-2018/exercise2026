package W11;

import java.util.Locale;

// Overriding: a subclass gives its own version of an inherited method
// (same name, same parameters).
// super.fee() runs the parent's version, so the base fee is written once, in ParcelE06.
class ParcelE06 {
    final String recipient;
    final double weightKg;

    ParcelE06(String recipient, double weightKg) {
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    double fee() {
        return 6.00 + 2.00 * weightKg;
    }
}

class ExpressParcelE06 extends ParcelE06 {
    ExpressParcelE06(String recipient, double weightKg) {
        super(recipient, weightKg);
    }

    @Override
    double fee() {
        return super.fee() + 8.00;                  // express surcharge
    }
}

class FragileParcelE06 extends ParcelE06 {
    FragileParcelE06(String recipient, double weightKg) {
        super(recipient, weightKg);
    }

    @Override
    double fee() {
        return super.fee() + 3.00;                  // insurance
    }
}

public class W11E06 {
    static String rm(double x) {
        return "RM " + String.format(Locale.ROOT, "%.2f", x);
    }

    public static void main(String[] args) {
        ParcelE06 p = new ParcelE06("Aisyah", 1.2);
        ExpressParcelE06 e = new ExpressParcelE06("Ben", 1.2);
        FragileParcelE06 f = new FragileParcelE06("Chong", 1.2);
        System.out.println("Parcel:  " + rm(p.fee()));
        System.out.println("Express: " + rm(e.fee()));
        System.out.println("Fragile: " + rm(f.fee()));
        // Try it: raise the base fee in ParcelE06 to RM 7.00. Which fees change?
    }
}
