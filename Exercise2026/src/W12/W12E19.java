package W12;

// AI check: this method was written by an AI assistant. It compiles. Run it.
// (Intentionally faulty: see W12E20 for the fix.)
class ParcelE19 {
    final String trackingNo;

    ParcelE19(String trackingNo) {
        this.trackingNo = trackingNo;
    }
}

class ExpressParcelE19 extends ParcelE19 {
    final int promisedHours;

    ExpressParcelE19(String trackingNo, int promisedHours) {
        super(trackingNo);
        this.promisedHours = promisedHours;
    }
}

public class W12E19 {
    // "Print the delivery promise of every parcel on the route."
    static void printPromises(ParcelE19[] route) {
        for (ParcelE19 p : route) {
            ExpressParcelE19 e = (ExpressParcelE19) p;
            System.out.println(e.trackingNo + ": " + e.promisedHours + " hours");
        }
    }

    public static void main(String[] args) {
        ParcelE19[] route = {
            new ExpressParcelE19("MY30041", 24),
            new ParcelE19("MY30042"),
            new ExpressParcelE19("MY30043", 12)
        };
        printPromises(route);
    }
}
