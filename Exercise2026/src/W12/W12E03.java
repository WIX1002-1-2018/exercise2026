package W12;

// The declared type decides what may be called (checked when compiling).
// The object decides which version of an overridden method runs (at run time).
// Through a ParcelE03 variable, a call must match a method that ParcelE03 declares or inherits,
// even when the variable refers to an express parcel.
class ParcelE03 {
    final String trackingNo;

    ParcelE03(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    String kind() {
        return "parcel";
    }
}

class ExpressParcelE03 extends ParcelE03 {
    private final int promisedHours;

    ExpressParcelE03(String trackingNo, int promisedHours) {
        super(trackingNo);
        this.promisedHours = promisedHours;
    }

    @Override
    String kind() {
        return "express";
    }

    int getPromisedHours() {                        // only express parcels have this
        return promisedHours;
    }
}

public class W12E03 {
    public static void main(String[] args) {
        ExpressParcelE03 e = new ExpressParcelE03("MY30007", 24);
        ParcelE03 p = e;                            // the same object, seen as a ParcelE03

        System.out.println(p.kind());               // allowed: ParcelE03 declares kind()
        System.out.println(e.getPromisedHours() + " hours");
        // Try it: add this line, then read the compiler message:
        // System.out.println(p.getPromisedHours());
    }
}
