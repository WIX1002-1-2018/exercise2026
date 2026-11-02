package W13;

// Reading a stack trace (this program stops on purpose).
// The Week 12 cast again: every parcel is cast to an express parcel.
// Read the trace from the top: the exception class, the message, the line that threw it,
// then the line that called that method.
class ParcelE01 {
    final String trackingNo;

    ParcelE01(String trackingNo) {
        this.trackingNo = trackingNo;
    }
}

class ExpressParcelE01 extends ParcelE01 {
    final int promisedHours;

    ExpressParcelE01(String trackingNo, int promisedHours) {
        super(trackingNo);
        this.promisedHours = promisedHours;
    }
}

public class W13E01 {
    static void printPromises(ParcelE01[] route) {
        for (ParcelE01 p : route) {
            ExpressParcelE01 e = (ExpressParcelE01) p;
            System.out.println(e.trackingNo + ": " + e.promisedHours + " hours");
        }
    }

    public static void main(String[] args) {
        ParcelE01[] route = {
            new ExpressParcelE01("MY30051", 24),
            new ParcelE01("MY30052"),
            new ExpressParcelE01("MY30053", 12)
        };
        printPromises(route);
        System.out.println("Route printed");
    }
}
