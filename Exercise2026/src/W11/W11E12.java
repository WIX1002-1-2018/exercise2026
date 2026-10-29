package W11;

import java.util.Objects;

// The standard equals(Object) and hashCode() (Week 10's equals(ParcelE09) took only one type).
// Rule for this hierarchy: two parcels are equal when their tracking numbers are equal.
// The tracking number is final and never null;
// equals and hashCode are final, so subclasses keep the rule.
// Equal objects must give equal hash codes (unequal objects may share one):
// HashMap and HashSet rely on it.
class ParcelE12 {
    private final String trackingNo;
    final String recipient;

    ParcelE12(String trackingNo, String recipient) {
        this.trackingNo = Objects.requireNonNull(trackingNo);
        this.recipient = recipient;
    }

    @Override
    public final boolean equals(Object o) {         // Object, not ParcelE12: this overrides
        if (this == o) {
            return true;
        }
        // A matching parcel, including a subclass object, is named other.
        // Reject null and objects outside the ParcelE12 hierarchy.
        if (!(o instanceof ParcelE12 other)) {
            return false;
        }
        return trackingNo.equals(other.trackingNo);
    }

    @Override
    public final int hashCode() {
        return trackingNo.hashCode();               // built from the same field as equals
    }
}

class ExpressParcelE12 extends ParcelE12 {
    ExpressParcelE12(String trackingNo, String recipient) {
        super(trackingNo, recipient);
    }
}

public class W11E12 {
    public static void main(String[] args) {
        ParcelE12 a = new ParcelE12("MY20001", "Aisyah");
        ParcelE12 b = new ParcelE12("MY20001", "Aisyah (new label)");
        ParcelE12 c = new ParcelE12("MY20002", "Ben");
        ExpressParcelE12 e = new ExpressParcelE12("MY20001", "Aisyah");

        System.out.println("a == b:        " + (a == b));
        System.out.println("a.equals(b):   " + a.equals(b));
        System.out.println("a.equals(c):   " + a.equals(c));
        System.out.println("a.equals(null): " + a.equals(null));
        System.out.println("a.equals(e):   " + a.equals(e) + ", e.equals(a): " + e.equals(a));
        System.out.println("same hashCode for a and b: " + (a.hashCode() == b.hashCode()));
        // Try it: what does a.equals("MY20001") print? Predict, then run.
    }
}
