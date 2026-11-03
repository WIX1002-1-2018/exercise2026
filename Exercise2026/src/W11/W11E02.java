package W11;

import java.util.Locale;

// extends: ExpressParcelE02 IS A ParcelE02 with one more field.
// It inherits getRecipient(), getWeightKg() and fee(), but not the private fields.
// UML: an arrow with a hollow triangle points from the subclass to the superclass.
//
//     ParcelE02  (superclass, parent)
//         ^
//         |
//  ExpressParcelE02  (subclass, child)
// This example uses the standard fee only. The RM 8.00 express surcharge returns in W11E06.
class ParcelE02 {
    private final String recipient;
    private final double weightKg;

    ParcelE02(String recipient, double weightKg) {
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    String getRecipient() {
        return recipient;
    }

    double getWeightKg() {
        return weightKg;
    }

    double fee() {
        return 6.00 + 2.00 * weightKg;
    }
}

class ExpressParcelE02 extends ParcelE02 {
    private final int promisedHours;                // the only new field

    ExpressParcelE02(String recipient, double weightKg, int promisedHours) {
        super(recipient, weightKg);                 // the parent's constructor sets its fields
        this.promisedHours = promisedHours;
    }

    int getPromisedHours() {
        return promisedHours;
    }
}

public class W11E02 {
    public static void main(String[] args) {
        ExpressParcelE02 e = new ExpressParcelE02("Ben", 1.2, 24);
        System.out.println(e.getRecipient() + ", " + e.getWeightKg() + " kg");   // inherited
        System.out.println("Promised in " + e.getPromisedHours() + " hours");     // its own
        System.out.println("Fee: RM " + String.format(Locale.ROOT, "%.2f", e.fee()));
        // Try it: change the base fee in ParcelE02 only. Does the express parcel follow?
    }
}
