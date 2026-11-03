package W12;

// instanceof checks the object's class before a cast.
// The pattern form (Java 16) checks and names the variable in one step:
// e exists only inside the true branch.
class ParcelE06 {
    final String trackingNo;

    ParcelE06(String trackingNo) {
        this.trackingNo = trackingNo;
    }
}

class ExpressParcelE06 extends ParcelE06 {
    private final int promisedHours;

    ExpressParcelE06(String trackingNo, int promisedHours) {
        super(trackingNo);
        this.promisedHours = promisedHours;
    }

    int getPromisedHours() {
        return promisedHours;
    }
}

public class W12E06 {
    public static void main(String[] args) {
        ParcelE06[] route = {
            new ParcelE06("MY30010"),
            new ExpressParcelE06("MY30011", 24),
            new ParcelE06("MY30012"),
            new ExpressParcelE06("MY30013", 12)
        };
        for (ParcelE06 p : route) {
            if (p instanceof ExpressParcelE06 e) {
                System.out.println(p.trackingNo + ": express, " + e.getPromisedHours() + " hours");
            } else {
                System.out.println(p.trackingNo + ": standard, 3 days");
            }
        }
        ParcelE06 none = null;
        System.out.println("null instanceof ParcelE06: " + (none instanceof ParcelE06));
    }
}
