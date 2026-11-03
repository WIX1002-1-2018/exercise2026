package W13;

// try-catch: the program goes on after a caught exception.
// Where the catch goes matters:
//  - around the call: the rest of the loop is skipped, and the program continues after the try-catch statement
//  - inside the loop: only the bad parcel is skipped, and the loop goes on
// (Week 12's W12E20 is still the better design: override, so no cast is needed.)
class ParcelE02 {
    final String trackingNo;

    ParcelE02(String trackingNo) {
        this.trackingNo = trackingNo;
    }
}

class ExpressParcelE02 extends ParcelE02 {
    final int promisedHours;

    ExpressParcelE02(String trackingNo, int promisedHours) {
        super(trackingNo);
        this.promisedHours = promisedHours;
    }
}

public class W13E02 {
    static void printPromises(ParcelE02[] route) {
        for (ParcelE02 p : route) {
            ExpressParcelE02 e = (ExpressParcelE02) p;
            System.out.println(e.trackingNo + ": " + e.promisedHours + " hours");
        }
    }

    static void printEach(ParcelE02[] route) {
        for (ParcelE02 p : route) {
            try {
                ExpressParcelE02 e = (ExpressParcelE02) p;
                System.out.println(e.trackingNo + ": " + e.promisedHours + " hours");
            } catch (ClassCastException ex) {
                System.out.println(p.trackingNo + ": not an express parcel");
            }
        }
    }

    public static void main(String[] args) {
        ParcelE02[] route = {
            new ExpressParcelE02("MY30051", 24),
            new ParcelE02("MY30052"),
            new ExpressParcelE02("MY30053", 12)
        };
        System.out.println("-- try around the call");
        try {
            printPromises(route);
        } catch (ClassCastException ex) {
            System.out.println("Caught: " + ex.getClass().getSimpleName());
        }
        System.out.println("after the call");

        System.out.println("-- try inside the loop");
        printEach(route);
    }
}
