package W12;

// Downcasting: a ParcelE05 variable that refers to an express parcel can be cast back,
// so the express-only method becomes available again.
// A cast changes how the reference is treated, not the object's class.
class ParcelE05 {
    final String trackingNo;

    ParcelE05(String trackingNo) {
        this.trackingNo = trackingNo;
    }
}

class ExpressParcelE05 extends ParcelE05 {
    private final int promisedHours;

    ExpressParcelE05(String trackingNo, int promisedHours) {
        super(trackingNo);
        this.promisedHours = promisedHours;
    }

    int getPromisedHours() {
        return promisedHours;
    }
}

public class W12E05 {
    public static void main(String[] args) {
        ParcelE05 p = new ExpressParcelE05("MY30008", 24);    // upcasting: automatic
        ExpressParcelE05 e = (ExpressParcelE05) p;             // downcasting: needs a cast
        System.out.println(e.trackingNo + ": " + e.getPromisedHours() + " hours");

        ParcelE05 q = new ParcelE05("MY30009");                // a plain parcel
        System.out.println(q.trackingNo + ": a plain parcel");
        // Try it 1: add this line. It compiles. Run it and read the error:
        // ExpressParcelE05 wrong = (ExpressParcelE05) q;
        // Try it 2: remove the cast (ExpressParcelE05) from line 30, then read the compiler message.
    }
}
