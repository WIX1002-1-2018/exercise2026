package W11.depot;

import W11.W11Parcel;

// Another package: CheckedParcelE14 (in W11.depot) extends W11Parcel (in W11).
// The subclass may use the protected weightKg through itself (this).
// It may NOT use the package-private auditNote(),
// and main (not a subclass) may not touch weightKg.
class CheckedParcelE14 extends W11Parcel {
    CheckedParcelE14(String trackingNo, double weightKg) {
        super(trackingNo, weightKg);
    }

    public String checkWeight() {
        return getTrackingNo() + ": " + (this.weightKg <= 30 ? "OK" : "too heavy");   // protected via this
    }
}

public class W11E14 {
    public static void main(String[] args) {
        CheckedParcelE14 a = new CheckedParcelE14("MY20001", 1.2);
        CheckedParcelE14 c = new CheckedParcelE14("MY20003", 35.0);
        System.out.println(a.checkWeight());
        System.out.println(c.checkWeight());
        // Try it 1: in checkWeight, call super.auditNote(). Try it 2: in main, print a.weightKg.
        // Try it 3: in CheckedParcelE14, add
        //     double peek(W11Parcel other) { return other.weightKg; }
        // Read the three compiler messages.
    }
}
