package W12;

// The fix for W12E19: give every parcel its own promise() and override it.
// The loop needs no cast, and a new kind of parcel only adds its own promise().
// (A second way: if (p instanceof ExpressParcelE20 e) for express parcels, with an else branch
//  that prints the standard promise, as in W12E06.)
class ParcelE20 {
    final String trackingNo;

    ParcelE20(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    String promise() {
        return "3 days";
    }
}

class ExpressParcelE20 extends ParcelE20 {
    final int promisedHours;

    ExpressParcelE20(String trackingNo, int promisedHours) {
        super(trackingNo);
        this.promisedHours = promisedHours;
    }

    @Override
    String promise() {
        return promisedHours + " hours";
    }
}

public class W12E20 {
    static void printPromises(ParcelE20[] route) {
        for (ParcelE20 p : route) {
            System.out.println(p.trackingNo + ": " + p.promise());
        }
    }

    public static void main(String[] args) {
        ParcelE20[] route = {
            new ExpressParcelE20("MY30041", 24),
            new ParcelE20("MY30042"),
            new ExpressParcelE20("MY30043", 12)
        };
        printPromises(route);
    }
}
